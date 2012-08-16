package com.crm.service.settings.system.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmEntitynameMapper;
import com.crm.mapper.XmFieldMapper;
import com.crm.mapper.XmTabMapper;
import com.crm.mapper.settings.system.XmApprove2userMapper;
import com.crm.mapper.settings.system.XmApproveMapper;
import com.crm.mapper.settings.system.XmApprovelogMapper;
import com.crm.mapper.settings.system.XmApprovestepMapper;
import com.crm.mapper.settings.system.XmStep2fieldsMapper;
import com.crm.mapper.settings.system.XmStep2usersMapper;
import com.crm.mapper.settings.system.XmStepadvfiltersMapper;
import com.crm.model.XmApprove;
import com.crm.model.XmApprove2user;
import com.crm.model.XmApprovelog;
import com.crm.model.XmApprovestep;
import com.crm.model.XmEntityname;
import com.crm.model.XmStep2fields;
import com.crm.model.XmStep2users;
import com.crm.model.XmStepadvfilters;
import com.crm.model.XmTab;
import com.crm.service.XmSequenceService;
import com.crm.service.settings.system.XmApproveService;
import com.crm.util.DateUtil;

@Service("xmApproveService")
public class XmApproveServiceImpl implements XmApproveService {
	
	XmApproveMapper xmApproveMapper;
	@Resource(name="xmApproveMapper")
	public void setXmApproveMapper(XmApproveMapper xmApproveMapper) {
		this.xmApproveMapper = xmApproveMapper;
	}
	
	@Autowired
	XmApprove2userMapper xmApprove2userMapper;
	@Autowired
	XmEntitynameMapper xmEntitynameMapper;
	@Autowired
	XmApprovelogMapper xmApprovelogMapper;
	@Autowired
	XmApprovestepMapper xmApprovestepMapper;
	@Autowired
	XmStepadvfiltersMapper xmStepadvfiltersMapper;
	@Autowired
	XmStep2usersMapper xmStep2usersMapper;
	@Autowired
	XmStep2fieldsMapper xmStep2fieldsMapper;
	@Autowired
	XmFieldMapper xmFieldMapper;
	@Autowired
	XmTabMapper xmTabMapper;
	
	@Autowired
	XmSequenceService xmSequenceService;
	
	private String subquery;
	private JSONObject jo=new JSONObject();
	


	@Override
	public List<XmApprove> getApproveList(int tabid) {
		return this.xmApproveMapper.getApproveList(tabid);
	}
	
	@Override
	public List<Object> getApproveRole(int approveid) {
		return this.xmApproveMapper.getApproveRole(approveid);
	}
	
	@Override
	public String getApproveRelatedModule(int approveid) {
		return this.xmApproveMapper.getApproveRelatedModule(approveid);
	}
	
	//获取审批对象
	public String getEntityCrmId(int crmid, String setype) {
		XmEntityname entityname=this.xmEntitynameMapper.getEntityByModule(setype);
		return this.xmEntitynameMapper.getEntityApprovelogName(entityname.getFieldname(), 
				                                               entityname.getTablename(), 
				                                               entityname.getEntityidfield(), 
				                                               crmid);
	}
	
	//我的审批中心
	public List<Object> approveStatus(String where,int userid,int page,int rows) {
		int offset = (page-1)*rows;
		String[] module_array;
		
		List<XmTab> result=this.xmTabMapper.getModuleNameByType("approve");
		module_array=new String[result.size()];
		for(int i=0;i<result.size();i++){
			module_array[i]=result.get(i).getName();
			jo.element(module_array[i], result.get(i).getTablabel());
		}
			
		subquery=this.getapprovemodulesubquery(module_array);
		return this.xmApprovelogMapper.getApproveStatus(subquery, userid, where, offset, rows);
	};
	
	@Override
	public int approveStatusTotal(String where,int userid) {
		return this.xmApprovelogMapper.getApproveStatusTotal(subquery, userid, where);
	}
	
	public String getapprovemodulesubquery(String[] modules){
		StringBuffer subquerystr=new StringBuffer();
		XmEntityname modulerel=new XmEntityname();
		String tablename="";
		String fieldid="";
		String currentsubquery="";
		for (String modulename : modules) {
			modulerel=this.getentitytable(modulename);
			tablename = modulerel.getTablename();
			fieldid = modulerel.getEntityidfield();
			currentsubquery = "select "+tablename+"."+fieldid+" as crmid,'"+jo.get(modulename)+"' as pre,'"+modulename+"' as setype,"+tablename+".deleted as deleted,"+tablename+".smownerid as smownerid " +
					"from "+tablename+" ";
			if (subquerystr.toString().equals(""))
			{
				subquerystr.append(currentsubquery);
			}
			else
			{
			    subquerystr.append(" union ("+currentsubquery+")");
			}
		}
		return subquerystr.toString();
	}
	
	public XmEntityname getentitytable(String modulename){
		return this.xmEntitynameMapper.getEntityByModule(modulename);
	}
	
	//强制审批完成
	@Override
	public int forceApproveFinish(int approveid, String modulename, int userid) {
		this.xmApprovelogMapper.updateByApproveid(userid, approveid);
		XmEntityname modulerel=this.xmEntitynameMapper.getEntityByModule(modulename);
		String tablename=modulerel.getTablename();
		String fieldid=modulerel.getEntityidfield();
		this.xmApprovelogMapper.updateModuleRel(tablename, userid, fieldid, approveid);
		return 1;
	}
	
	//强制返回审批流程
	@Override
	public int forceApproveRetStart(int approveid, String modulename,int userid) {
		String nowtime=DateUtil.format(new Date(), DateUtil.C_TIME_PATTON_DEFAULT);
		XmEntityname modulerel=this.xmEntitynameMapper.getEntityByModule(modulename);
		String tablename=modulerel.getTablename();
		String fieldid=modulerel.getEntityidfield();
		List<XmApprovelog> list=this.xmApprovelogMapper.selectByApproveid(approveid);
		XmApprovelog approvelog=new XmApprovelog();
		for(XmApprovelog row:list){
			this.xmApprovelogMapper.updateApproveRefuse(userid, nowtime, row.getId());
			this.xmApprovelogMapper.updateModuleRelRefuse(tablename, fieldid, row.getCrmid());
			int id=this.xmSequenceService.getSequenceId("approvelog");
			approvelog.setId(id);
			approvelog.setCrmid(row.getCrmid());
			approvelog.setApproveid(-1);
			approvelog.setStepid(-1);
			approvelog.setApproveresult(0);
			approvelog.setCreatedAt(DateUtil.parseDate(DateUtil.C_TIME_PATTON_DEFAULT, nowtime));
			approvelog.setUpdatedAt(DateUtil.parseDate(DateUtil.C_TIME_PATTON_DEFAULT, nowtime));
			this.xmApprovelogMapper.insertSelective(approvelog);
		}
		return 1;
	}
	
	@Override
	public boolean islaststep(int sequnce,int approveid) {
		int maxseq=this.xmApprovestepMapper.getApproveStepSequnce(approveid);
		if(sequnce==maxseq)
			return true;
		else
		    return false;
	}
	
	@Override
	public int gotoUpDownStep(int stepid, int approveid, int sequnce,
			String operation) {
		int currseq=0;
		if(operation.equals("up")){
			currseq=sequnce-1;
			this.xmApprovestepMapper.upPreStepSequnce(approveid, currseq);
			this.xmApprovestepMapper.upStepSequnce(stepid);
		}else{
			currseq=sequnce+1;
			this.xmApprovestepMapper.downPreStepSequnce(approveid, currseq);
			this.xmApprovestepMapper.downStepSequnce(stepid);
		}
		return 1;
	}
	
	@Override
	public int updateMultiApprove(XmApprove xmApprove, int approveid,
			String userArr) {
		int affect=this.xmApproveMapper.updateByPrimaryKeySelective(xmApprove);
		this.doMultiApprove(approveid, userArr);
		return affect;
	}
	
	@Override
	public int insertMultiApprove(XmApprove xmApprove, int approveid,
			String userArr) {
		int id=this.xmSequenceService.getSequenceId("approve");
		xmApprove.setId(id);
		int affect=this.xmApproveMapper.insertSelective(xmApprove);
		this.doMultiApprove(id, userArr);
		return affect;
	}
	
	@Override
	public int deleteMultiApprove(int id) {
		int affect=this.xmApproveMapper.deleteByPrimaryKey(id);
		this.xmApprove2userMapper.delete(id);
		return affect;
	}
	
	public int doMultiApprove(int approveid,String userArr){
		this.xmApprove2userMapper.delete(approveid);
		XmApprove2user xmApprove2user=new XmApprove2user();
		for(String userid:userArr.split(",")){
			xmApprove2user.setUserid(userid);
			xmApprove2user.setApproveid(approveid);
			this.xmApprove2userMapper.insert(xmApprove2user);
		}
		return 1;
	}
	
	
	
	//判断流程是否正在使用
	@Override
	public int getApproveUsed(int approveid) {
		String modulename=this.xmApproveMapper.getApproveRelatedModule(approveid);
		XmEntityname modulerel=this.xmEntitynameMapper.getEntityByModule(modulename);
		String tablename=modulerel.getTablename();
		String fieldid=modulerel.getEntityidfield();
		return this.xmApprovelogMapper.getApproveUsed(tablename, fieldid, approveid);
	}
	
	@Override
	public List<Object> getApproveStepList(int approveid) {
		List<Object> list=this.xmApproveMapper.getApproveStepList(approveid);
		return list;
	}
	
	@Override
	public XmApprove getApproveListById(int approveid) {
		return this.xmApproveMapper.getApproveListById(approveid);
	}
	
	@Override
	public XmApprovestep getApproveStepById(Integer id) {
		return this.xmApprovestepMapper.getApproveStepById(id);
	}
	
	@Override
	public List<Object> getApproveStepUsers() {
		return this.xmApprovestepMapper.getApproveStepUsers();
	}
	
	//审批步骤页面的下一步骤列表
	@Override
	public List<XmApprovestep> getApproveNextStep(int approveid, int id) {
		return this.xmApprovestepMapper.getApproveNextStep(approveid, id);
	}
	
	@Override
	public List<XmStepadvfilters> getStepAdvFilterById(int stepid) {
		return this.xmStepadvfiltersMapper.getStepAdvFilterById(stepid);
	}
	
	public int getApproveStepSequnce(int approveid) {
		int sequnce=this.xmApprovestepMapper.getApproveStepSequnce(approveid);
		return sequnce+1;
	}
	
	@Override
	public int deleteApproveStep(int id) {
		this.xmApprovestepMapper.deleteByPrimaryKey(id);
		this.xmStep2usersMapper.deleteByStepId(id);
		this.xmStep2fieldsMapper.deleteByStepId(id);
		this.xmStepadvfiltersMapper.deleteByStepId(id);
		return 1;
	}
	
	@Override
	public int insertApproveStep(int stepid, String step, String step2users,
			String step2fields, String step2advoption) {
//		int id=this.xmSequenceService.getSequenceId("approvestep");
//		int sequnce=this.getApproveStepSequnce(stepid);
//		JSONObject stepjson=JSONObject.fromObject(step);
//		XmApprovestep xmApprovestep=new XmApprovestep();
//		xmApprovestep.setId(id);
//		xmApprovestep.setApproveid(stepid);
//		xmApprovestep.setName(stepjson.getString("name"));
//		xmApprovestep.setMemo(stepjson.getString("memo"));
//		xmApprovestep.setEnded(stepjson.getInt("ended"));
//		xmApprovestep.setIsfirststep(0);
//		xmApprovestep.setSequnce(sequnce);
//		xmApprovestep.setNextstep(stepjson.getInt("nextstep"));
//		xmApprovestep.setCreatedAt(DateUtil.parseDate(DateUtil.C_TIME_PATTON_DEFAULT, stepjson.getString("updated_at")));
//		xmApprovestep.setUpdatedAt(DateUtil.parseDate(DateUtil.C_TIME_PATTON_DEFAULT, stepjson.getString("updated_at")));
//		xmApprovestep.setAlterapproveowner(stepjson.getInt("alterapproveowner"));
//		this.xmApprovestepMapper.insertSelective(xmApprovestep);
//		
//		this.doStep2Users(id, step2users);
//		
//		String[] array=this.xmFieldMapper.getApproveStepFilterOfFieldid(stepjson.getInt("tabid")).split(",");
//		XmStep2fields xmStep2fields=new XmStep2fields();
//		xmStep2fields.setStepid(id);
//		xmStep2fields.setReadonly(0);
//		for(String fieldid:array){
//			xmStep2fields.setFieldid(Integer.parseInt(fieldid));
//			this.xmStep2fieldsMapper.insert(xmStep2fields);
//		}
//		
//		this.updateStep2Fields(id, step2fields,0);
//		this.doStepAdvFilters(id, step2advoption);
		return 1;
	}
	
	//更新审批步骤
	@Override
	public int updateApproveStepById(int stepid, String step,
			String step2users, String step2fields, String step2advoption) {
		JSONObject stepjson=JSONObject.fromObject(step);
		XmApprovestep xmApprovestep=new XmApprovestep();
		xmApprovestep.setName(stepjson.getString("name"));
		xmApprovestep.setNextstep(stepjson.getInt("nextstep"));
		xmApprovestep.setEnded(stepjson.getInt("ended"));
		xmApprovestep.setAlterapproveowner(stepjson.getInt("alterapproveowner"));
		xmApprovestep.setUpdatedAt(DateUtil.parseDate(DateUtil.C_TIME_PATTON_DEFAULT, stepjson.getString("updated_at")));
		xmApprovestep.setMemo(stepjson.getString("memo"));
		xmApprovestep.setId(stepid);
		this.xmApprovestepMapper.updateByPrimaryKeySelective(xmApprovestep);
		
		this.doStep2Users(stepid, step2users);
		this.updateStep2Fields(stepid, step2fields,1);
		this.doStepAdvFilters(stepid, step2advoption);
		return 1;
	}
	
	//xm_step2users 审批人信息
	public int doStep2Users(int stepid,String step2users){
		this.xmStep2usersMapper.deleteByStepId(stepid);
		JSONArray ja=JSONArray.fromObject(step2users);
		XmStep2users step2Users=new XmStep2users();
		step2Users.setStepid(stepid);
		for(int i=0;i<ja.size();i++){
			step2Users.setUserid(ja.getJSONObject(i).getInt("userid"));
			step2Users.setAlternate(ja.getJSONObject(i).getInt("alternate"));
			this.xmStep2usersMapper.insert(step2Users);
		}
		return 1;
	}
	
	//xm_step2fields 字段权限
	public int updateStep2Fields(int stepid,String step2fields,int flag){
		StringBuffer sb=new StringBuffer();
		sb.append("(");
		String arr[]=step2fields.split(",");
		for(int j=0;j<arr.length;j++){
			sb.append(Integer.parseInt(arr[j])+",");
		}
		String fieldids=sb.toString().substring(0, sb.toString().length()-1)+")";	
		if(flag==1)
			this.xmStep2fieldsMapper.updateByStepIdZero(stepid, fieldids);
		this.xmStep2fieldsMapper.updateByStepId(stepid, fieldids);
		return 1;
	}
	
	//xm_stepadvfilters 高级功能
	public int doStepAdvFilters(int stepid, String step2advoption){
		this.xmStepadvfiltersMapper.deleteByStepId(stepid);
		JSONArray adv=JSONArray.fromObject(step2advoption);
		XmStepadvfilters stepAdvFilter=new XmStepadvfilters();
		stepAdvFilter.setStepid(stepid);
		if(!adv.getJSONObject(0).getString("thevalue").equals("0")){
			String columnname=adv.getJSONObject(0).getString("columnname");
			for(int j=0;j<adv.size();j++){
				stepAdvFilter.setColumnindex(j+1);
				stepAdvFilter.setColumnname(columnname);
				stepAdvFilter.setThevalue(adv.getJSONObject(0).getString("thevalue"));
				this.xmStepadvfiltersMapper.insert(stepAdvFilter);
			}
		}
		return 1;
	}
	
	
	

}

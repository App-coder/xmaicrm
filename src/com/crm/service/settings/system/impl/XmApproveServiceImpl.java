package com.crm.service.settings.system.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmEntitynameMapper;
import com.crm.mapper.settings.system.XmApprove2userMapper;
import com.crm.mapper.settings.system.XmApproveMapper;
import com.crm.mapper.settings.system.XmApprovelogMapper;
import com.crm.mapper.settings.system.XmApprovestepMapper;
import com.crm.mapper.settings.system.XmStep2fieldsMapper;
import com.crm.mapper.settings.system.XmStep2usersMapper;
import com.crm.mapper.settings.system.XmStepadvfiltersMapper;
import com.crm.model.XmApprove;
import com.crm.model.XmApprove2user;
import com.crm.model.XmApprovestep;
import com.crm.model.XmEntityname;
import com.crm.model.XmStep2users;
import com.crm.model.XmStepadvfilters;
import com.crm.service.settings.system.XmApproveService;

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
	


	@Override
	public List<XmApprove> getApproveList(int tabid) {
		return this.xmApproveMapper.getApproveList(tabid);
	}
	
	@Override
	public List<Object> getApproveRole(int approveid) {
		return this.xmApproveMapper.getApproveRole(approveid);
	}
	
	@Override
	public int updateMultiApprove(XmApprove xmApprove, int approveid,
			String userArr) {
		int affect=this.xmApproveMapper.updateByPrimaryKeySelective(xmApprove);
		this.xmApprove2userMapper.delete(approveid);
		XmApprove2user xmApprove2user=new XmApprove2user();
		for(String userid:userArr.split(",")){
			xmApprove2user.setUserid(userid);
			xmApprove2user.setApproveid(approveid);
			this.xmApprove2userMapper.insert(xmApprove2user);
		}
		return affect;
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
		xmApprovestep.setMemo(stepjson.getString("memo"));
		xmApprovestep.setId(stepid);
		this.xmApprovestepMapper.updateByPrimaryKeySelective(xmApprovestep);
		
		this.xmStep2usersMapper.deleteByStepId(stepid);
		JSONArray ja=JSONArray.fromObject(step2users);
		XmStep2users step2Users=new XmStep2users();
		step2Users.setStepid(stepid);
		for(int i=0;i<ja.size();i++){
			step2Users.setUserid(ja.getJSONObject(i).getInt("userid"));
			step2Users.setAlternate(ja.getJSONObject(i).getInt("alternate"));
			this.xmStep2usersMapper.insert(step2Users);
		}
		
		StringBuffer sb=new StringBuffer();
		sb.append("(");
		String arr[]=step2fields.split(",");
		for(int j=0;j<arr.length;j++){
			sb.append(Integer.parseInt(arr[j])+",");
		}
		String fieldids=sb.toString().substring(0, sb.toString().length()-1)+")";	
		
		this.xmStep2fieldsMapper.updateByStepId(stepid, fieldids);
		
		this.xmStepadvfiltersMapper.deleteByStepId(stepid);
		JSONArray adv=JSONArray.fromObject(step2advoption);
		XmStepadvfilters stepAdvFilter=new XmStepadvfilters();
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

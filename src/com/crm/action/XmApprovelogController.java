package com.crm.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.service.XmEntitynameService;
import com.crm.service.settings.system.XmApproveService;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.JsonDateValueProcessor;

/**
 * 
 * 我的审批中心
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 上午9:46:23
 */
@Controller
@RequestMapping(value = "crm/approvelog")
@SessionAttributes({Constant.USERPERMISSION})
public class XmApprovelogController {
	
	@Autowired
	XmApproveService xmApproveService;
	@Autowired
	XmEntitynameService xmEntitynameService;
	
	/**
	 * 
	 * 未审核
	 * @return
	 */
	@RequestMapping(value = "/willapprove", method = RequestMethod.POST)
	@ResponseBody
	public String willapprove(){
		ListBean bean = new ListBean();
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
	
	
	/**
	 * 待审核
	 * @return
	 */
	@RequestMapping(value = "/hasapprove", method = RequestMethod.POST)
	@ResponseBody
	public String hasapprove(){
		ListBean bean = new ListBean();
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
	/**
	 * 审批中心
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/approveStatus", method = RequestMethod.POST)
	@ResponseBody
	public String approveStatus(String folder,int page,int rows,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		String where="";
		int userid=userPermission.getUser().getId();
		if(folder.equalsIgnoreCase("unremind")){
			where=" ((xm_approve.userselected<>1 and" +
					" ((xm_approvelog.stepid=-1 and crmentity.smownerid="+userid+" ) or xm_step2users.userid="+userid+"))" +
					" or (xm_approve.userselected=1 and xm_approvelog.approved_by="+userid+" )) and xm_approvelog.approveresult=0 ";
		}else{
			where=" xm_approvelog.approved_by="+userid+" and xm_approvelog.approveresult<>0 ";
		}
		where=" where crmentity.deleted=0 and "+where;
		
		List approvelog=new ArrayList();
		JSONObject jo=new JSONObject();
		JSONArray ja=new JSONArray();
		JsonConfig config = new JsonConfig();  
		config.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessor());
		List<Object> list=this.xmApproveService.approveStatus(where, userid, page, rows);
		for(int i=0;i<list.size();i++){
			jo=JSONObject.fromObject(list.get(i), config);
			String entityname=this.xmApproveService.getEntityCrmId(jo.getInt("crmid"),jo.getString("setype"));
			jo.put("crmid", jo.getString("pre")+":"+entityname);
			ja.add(jo);
		}
		int total=this.xmApproveService.approveStatusTotal(where, userid);
		JSONObject joo=new JSONObject();
		joo.element("total", total);
		joo.element("rows", ja);
		return JSON.toJSONStringWithDateFormat(joo,DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
	

	
}

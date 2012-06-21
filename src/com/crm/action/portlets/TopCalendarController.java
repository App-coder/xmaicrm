package com.crm.action.portlets;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmActivity;
import com.crm.service.module.XmActivityService;
import com.crm.util.Constant;

import java.util.*;

@Controller
@SessionAttributes(Constant.USERPERMISSION)
@RequestMapping(value = "crm/portlets/top_calendar")
public class TopCalendarController {

	XmActivityService xmActivityService;
	@Resource(name="xmActivityService")
	public void setXmActivityService(XmActivityService xmActivityService) {
		this.xmActivityService = xmActivityService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/topcalendar";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		ListBean bean = new ListBean();
		
		List<XmActivity> activitys = this.xmActivityService.getTopActivity(userPermission.getUser().getId()+"");
		bean.setRows(activitys);
		bean.setTotal(activitys.size());
		
		return JSON.toJSONString(bean);
	}
	
}
package com.crm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.util.DateUtil;

/**
 * 自定义提醒
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 上午10:43:03
 */
@Controller
@RequestMapping(value = "crm/reminders")
public class XmRemindersController {

	@RequestMapping(value = "/runremind", method = RequestMethod.POST)
	@ResponseBody
	public String runremind(){
		ListBean bean = new ListBean();
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
	@RequestMapping(value = "/overremind", method = RequestMethod.POST)
	@ResponseBody
	public String overremind(){
		ListBean bean = new ListBean();
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
	
}

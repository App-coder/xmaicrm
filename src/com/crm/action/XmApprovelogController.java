package com.crm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

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
public class XmApprovelogController {
	
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

	
}

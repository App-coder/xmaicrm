package com.crm.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmActivity;
import com.crm.service.XmActivityService;
import java.util.*;

/**
 * 相关信息-日程安排
 * 
 * User: zhujun
 * Date: 2012-8-24
 * Time: 下午8:01:18
 */
@Controller
@RequestMapping(value = "crm/activity")
public class XmActivityController {
	
	XmActivityService xmActivityService;
	@Resource(name="com.crm.service.impl.xmActivityService")
	public void setXmActivityService(XmActivityService xmActivityService) {
		this.xmActivityService = xmActivityService;
	}



	/**
	 * 
	 * 营销活动
	 * 
	 * 相关信息-日程安排
	 * 
	 * @param page
	 * @param rows
	 * @param crmid
	 * @return
	 */
	@RequestMapping(value = "/getActivities", method = RequestMethod.GET)
	@ResponseBody
	public String getActivities(int page,int rows,int crmid){
		
		ListBean bean = new ListBean();
		
		int total = this.xmActivityService.getTotalForGetActivities(crmid);
		List<XmActivity> activities = this.xmActivityService.getActivities(page,rows,crmid);
		
		bean.setTotal(total);
		bean.setRows(activities);
		
		return JSON.toJSONString(bean);
	}
	
}

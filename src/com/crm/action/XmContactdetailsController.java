package com.crm.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmContactdetails;
import com.crm.service.XmContactdetailsService;
import java.util.*;

/**
 * 联系记录
 * 
 * User: zhujun
 * Date: 2012-8-18
 * Time: 下午9:59:55
 */
@Controller
@RequestMapping(value = "crm/contactdetails")
public class XmContactdetailsController {

	XmContactdetailsService xmContactdetailsService;
	@Resource(name="xmContactdetailsService")
	public void setXmContactdetailsService(
			XmContactdetailsService xmContactdetailsService) {
		this.xmContactdetailsService = xmContactdetailsService;
	}


	/**
	 * 相关信息，联系人
	 * 
	 * @param page
	 * @param rows
	 * @param campaignid
	 * @return
	 */
	@RequestMapping(value = "/getContacts", method = RequestMethod.POST)
	@ResponseBody
	public String getContacts(int page,int rows,int campaignid){
		ListBean bean = new ListBean();
		
		int total = this.xmContactdetailsService.getTotalForGetContacts(campaignid);
		List<XmContactdetails> contacts = this.xmContactdetailsService.getContactdetails(page,rows,campaignid);
		bean.setTotal(total);
		bean.setRows(contacts);
		
		return JSON.toJSONString(bean);
	}
	
	/**
	 * 
	 * 根据客户ID获取联系人
	 * 
	 * @param accountid 客户ID
	 * @return
	 */
	@RequestMapping(value = "/getContactsByAccountid", method = RequestMethod.GET)
	@ResponseBody
	public String getContactsByAccountid(String accountid){
		List<XmContactdetails> list = this.xmContactdetailsService.getContactdetailsByAccountid(accountid);
		
		return JSON.toJSONString(list);
	}
	
	
}

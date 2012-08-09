package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmAccount;
import com.crm.service.portlets.XmAccountService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

import java.util.*;

import javax.annotation.Resource;

/**
 * 
 * 今日待联系客户
 * 
 * User: zhujun
 * Date: 2012-8-8
 * Time: 下午10:11:12
 */
@Controller
@RequestMapping(value = "crm/portlets/today_account")
@SessionAttributes(Constant.USERPERMISSION)
public class TodayaccountController {
	
	XmAccountService xmAccountService;
	@Resource(name="com.crm.service.portlets.impl.xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmAccount> account = this.xmAccountService.getTodayaccount(userPermission.getUser().getId()+"",DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT));
		
		bean.setTotal(account.size());
		bean.setRows(account);
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr;
	}
	
}

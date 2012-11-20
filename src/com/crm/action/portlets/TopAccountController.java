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
import com.crm.model.XmAccount;
import com.crm.service.module.XmAccountService;
import com.crm.util.Constant;

import java.util.*;

@Controller
@SessionAttributes(Constant.USERPERMISSION)
@RequestMapping(value = "crm/portlets/top_account")
public class TopAccountController {
	
	XmAccountService xmAccountService;
	@Resource(name="xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/topaccount";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		ListBean bean = new ListBean();
		List<XmAccount> accounts = this.xmAccountService.getTopAccount(userPermission.getUser().getId()+"");
		bean.setRows(accounts);
		bean.setTotal(accounts.size());
		
		return JSON.toJSONString(bean);
	}
	
}
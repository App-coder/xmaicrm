package com.crm.customer.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.customer.service.XmAccountService;
import com.crm.model.XmCustomview;
import com.crm.model.XmPotential;
import com.crm.service.XmCustomViewService;

@Controller
@RequestMapping(value = "account")
public class XmAccountController extends BaseController{
	XmAccountService xmAccountService;
	@Resource(name="xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}
	
	
	
	
}

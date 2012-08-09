package com.crm.customer.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

@Controller
@RequestMapping(value = "customer")
public class XmAccountsController extends BaseController{
	
	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public String index(){
		return "customer/accounts";
	}
	
}

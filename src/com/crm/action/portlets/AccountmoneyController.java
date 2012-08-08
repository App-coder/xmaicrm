package com.crm.action.portlets;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "crm/portlets/accountmoney")
public class AccountmoneyController {

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/accountmoney";
	}
	
}

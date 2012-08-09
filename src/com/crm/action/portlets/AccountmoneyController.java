package com.crm.action.portlets;


import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.XmParenttab;
import com.crm.util.CacheManager;
import com.crm.util.Constant;

@Controller
@RequestMapping(value = "crm/portlets/accountmoney")
public class AccountmoneyController {

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		

		
		return "portlets/accountmoney";
	}
	
}

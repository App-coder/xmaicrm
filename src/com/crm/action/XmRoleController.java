package com.crm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "crm/role")
public class XmRoleController extends BaseController {
	
	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public String config(){
		return "";
	}
	
}

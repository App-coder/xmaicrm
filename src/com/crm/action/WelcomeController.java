package com.crm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "welcome")
public class WelcomeController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "welcome";
	}
	
	@RequestMapping(value = "/console", method = RequestMethod.GET)
	public String console(){
		return "console";
	}
	
}

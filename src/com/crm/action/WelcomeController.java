package com.crm.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String homepage(){
		return "homepage";
	}
	
	@RequestMapping(value = "/desktop", method = RequestMethod.GET)
	public String desktop(){
		return "desktop";
	}
	
	@RequestMapping(value = "/navbar", method = RequestMethod.POST)
	public String navbar(String url,ModelMap modelmap){
		modelmap.addAttribute("url",url);
		return "navbar";
	}
	
}

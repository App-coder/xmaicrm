package com.crm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "crm/search")
public class XmSearchController {

	@RequestMapping(value = "/query", method = RequestMethod.POST)
	@ResponseBody
	public String query(String searchuser){
		return "query";
	}
	
}

package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 日/周/月报
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:27:35
 */
@Controller
@RequestMapping(value = "crm/portlets/datelogs")
public class DatelogsController {

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/datelogs";
	}
	
}

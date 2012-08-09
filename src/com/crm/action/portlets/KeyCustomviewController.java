package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 关键视图
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:13:50
 */
@Controller
@RequestMapping(value = "crm/portlets/key_customview")
public class KeyCustomviewController {

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		
		return "portlets/keycustomview";
	}
	
}

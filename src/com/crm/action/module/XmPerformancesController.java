package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 销售-员工绩效
 * 
 * User: zhujun
 * Date: 2012-8-1
 * Time: 下午4:25:25
 */
@Controller
@RequestMapping(value = "performances")
public class XmPerformancesController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "potential/performances";
	}
	
}

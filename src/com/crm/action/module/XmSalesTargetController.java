package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 销售目标
 * 
 * User: zhujun
 * Date: 2012-8-1
 * Time: 下午4:30:50
 */
@Controller
@RequestMapping(value = "salestarget")
public class XmSalesTargetController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "potential/salestarget";
	}
	
}

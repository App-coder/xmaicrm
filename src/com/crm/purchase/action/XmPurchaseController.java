package com.crm.purchase.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 采购模块
 * 
 * User: zhujun
 * Date: 2012-8-2
 * Time: 下午10:16:04
 */
@Controller
@RequestMapping(value = "purchase")
public class XmPurchaseController {

	@RequestMapping(value = "/nav", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "purchase/purchase";
	}
	
}

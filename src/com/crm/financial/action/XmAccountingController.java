package com.crm.financial.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 财务控制器
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午10:15:43
 */
@Controller
@RequestMapping(value = "accounting")
public class XmAccountingController {

	
	/**
	 * 财务导航
	 */
	@RequestMapping(value = "/nav", method = RequestMethod.GET)
	public String nav(){
		return "financial/nav";
	}
	
	
}

package com.crm.inventory.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 库存控制器
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午8:35:35
 */
@Controller
@RequestMapping(value = "inventory")
public class XmInventoryController {

	/**
	 * 库存导航
	 */
	@RequestMapping(value = "/nav", method = RequestMethod.GET)
	public String nav(){
		return "inventory/nav";
	}
	
	
}

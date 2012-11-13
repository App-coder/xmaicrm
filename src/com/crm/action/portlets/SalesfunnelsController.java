package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 销售漏斗
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:43:32
 * 
 */
@Controller
@RequestMapping(value = "crm/portlets/salesfunnels")
public class SalesfunnelsController {
	@RequestMapping(value = "/index")
	public String index(){
		return "portlets/salesfunnels";
	}
	
}

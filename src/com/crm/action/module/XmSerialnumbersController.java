package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 产品序列号
 * 
 * User: zhujun
 * Date: 2012-8-22
 * Time: 上午11:23:24
 */
@Controller
@RequestMapping(value = "serialnumbers")
public class XmSerialnumbersController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "product/serialnumbers";
	}
	
}

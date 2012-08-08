package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 知识库
 * 
 * User: zhujun
 * Date: 2012-8-3
 * Time: 下午6:57:05
 */
@Controller
@RequestMapping(value = "faq")
public class XmFaqController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "afterser/faq";
	}
	
}

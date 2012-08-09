package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公司应收款月度同比
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:19:34
 */
@Controller
@RequestMapping(value = "crm/portlets/gathersyear")
public class GathersyearController {
	
	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		
		return "portlets/gathersyear";
	}

}

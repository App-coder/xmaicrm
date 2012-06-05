package com.crm.action.report;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 常用报表
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:01:14
 */
@Controller
@RequestMapping(value = "ureports")
public class XmUreportsController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "report/ureports";
	}
	
	
}

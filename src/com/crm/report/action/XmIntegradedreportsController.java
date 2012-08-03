package com.crm.report.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
/**
 * 
 * 综合报表控制器
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午9:57:15
 */
@Controller
@RequestMapping(value = "integradedreports")
public class XmIntegradedreportsController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "report/integradedreports";
	}
	
}

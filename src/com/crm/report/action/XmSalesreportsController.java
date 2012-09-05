package com.crm.report.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 年终销售列表
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:02:36
 */
@Controller
@RequestMapping(value = "salesreports")
public class XmSalesreportsController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "report/salesreports";
	}
	
	
}

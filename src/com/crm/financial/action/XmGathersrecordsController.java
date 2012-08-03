package com.crm.financial.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
/**
 * 
 * 收款单控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午3:02:06
 */
@Controller
@RequestMapping(value = "gathersrecords")
public class XmGathersrecordsController extends BaseController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "financial/gathersrecords";
	}
	
}

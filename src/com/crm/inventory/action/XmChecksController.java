package com.crm.inventory.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 盘点控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 上午12:04:08
 */
@Controller
@RequestMapping(value = "checks")
public class XmChecksController extends BaseController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "inventory/checks";
	}
	
	
}

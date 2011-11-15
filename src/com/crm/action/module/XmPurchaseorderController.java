package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
/**
 * 进货单控制器
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午10:49:40
 */
@Controller
@RequestMapping(value = "purchaseorder")
public class XmPurchaseorderController extends BaseController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "purchase/purchaseorder";
	}
	
}

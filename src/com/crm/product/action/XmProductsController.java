package com.crm.product.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

@Controller
@RequestMapping(value = "product")
public class XmProductsController extends BaseController{
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "product/index";
	}
	
	
}

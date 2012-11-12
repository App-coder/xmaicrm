package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 产品控制器
 * 
 * User: zhujun
 * Date: 2012-8-22
 * Time: 上午11:23:14
 */
@Controller
@RequestMapping(value = "product")
public class XmProductsController extends BaseController{
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "product/index";
	}
	
	
}

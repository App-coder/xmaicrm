package com.crm.action.module;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 采购导航模块
 * 
 * User: zhangjun
 * Date: 2012-8-23
 * Time: 下午22:04:36
 */
@Controller
@RequestMapping(value = "bsteps")
public class XmBstepsController extends BaseController{
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "purchase/bsteps";
	}

}

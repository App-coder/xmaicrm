package com.crm.settings.basic.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 基本设置-全局共享规则
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:16:00
 */
@Controller
@RequestMapping(value = "settings/deforgshare")
public class XmDefOrgShareController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/basic/deforgshare";
	}
	
}

package com.crm.settings.system.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 系统定制-页面布局
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:44:46
 */
@Controller
@RequestMapping(value = "crm/settings/layoutlist")
public class XmLayoutController extends BaseController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/layoutlist";
	}

}

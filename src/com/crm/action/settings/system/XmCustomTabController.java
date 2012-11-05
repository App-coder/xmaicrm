package com.crm.action.settings.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 系统设置-主菜单
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:50:04
 */
@Controller
@RequestMapping(value = "settings/customtab")
public class XmCustomTabController extends BaseController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/customtab";
	}
	
}

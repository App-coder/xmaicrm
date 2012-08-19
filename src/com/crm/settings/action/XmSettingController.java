package com.crm.settings.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 控制面板基本控制器
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:07:11
 */
@Controller
@RequestMapping(value = "crm/setting")
public class XmSettingController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/setting";
	}
	
}

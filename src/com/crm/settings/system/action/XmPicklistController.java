package com.crm.settings.system.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 系统设置-下拉框设置
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:40:08
 */
@Controller
@RequestMapping(value = "picklist")
public class XmPicklistController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/picklist";
	}
	
}

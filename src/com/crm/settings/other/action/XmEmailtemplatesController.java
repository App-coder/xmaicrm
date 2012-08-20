package com.crm.settings.other.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
/**
 * 
 * 其他设置-Email模版 
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "settings/emailtemplates")
public class XmEmailtemplatesController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/other/emailtemplates";
	}
	
}
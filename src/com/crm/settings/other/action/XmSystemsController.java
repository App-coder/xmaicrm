package com.crm.settings.other.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: zhujun
 * Date: 2012-8-12
 * Time: 下午9:07:01
 * 
 * 其他设置-SMTP服务器 
 * 
 */
@Controller
@RequestMapping(value = "settings/system")
public class XmSystemsController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/other/system";
	}

}

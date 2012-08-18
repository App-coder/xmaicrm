package com.crm.settings.other.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
import com.crm.util.Constant;
/**
 * 
 * 其他设置-授权许可 
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "settings/license")
public class XmLicenseController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		modelMap.addAttribute("starttime",Constant.starttime);
		modelMap.addAttribute("endtime",Constant.endtime);
		
		return "settings/other/license";
	}
	
	
	
}

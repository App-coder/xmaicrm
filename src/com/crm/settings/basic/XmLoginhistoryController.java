package com.crm.settings.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 基本设置-登入历史
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:21:44
 */
@Controller
@RequestMapping(value = "settings/loginhistory")
public class XmLoginhistoryController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/basic/loginhistory";
	}
	
}

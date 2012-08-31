package com.crm.settings.system.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;

/**
 * 
 * 系统设置-相关信息模块字段
 * 
 * User: zhujun
 * Date: 2012-8-20
 * Time: 上午9:12:49
 */
@Controller
@RequestMapping(value = "crm/settings/relmodfield")
public class XmRelmodFieldController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/relmodfield";
	}
	
}

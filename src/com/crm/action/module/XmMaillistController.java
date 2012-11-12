package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.util.ModuleUtil;

/**
 * 群发邮件
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午8:15:27
 */
@Controller
@RequestMapping(value = "maillist")
public class XmMaillistController {

	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "marketing/maillist";
	}
	
}

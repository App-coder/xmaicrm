package com.crm.marketing.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.util.ModuleUtil;

/**
 * 
 * 短信群发
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午8:09:13
 */
@Controller
@RequestMapping(value = "qunfa")
public class XmQunfaController {

	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		this.moduleUtil.setViewProp(modelMap,"Qunfa");
		return "marketing/qunfa";
	}
	
}

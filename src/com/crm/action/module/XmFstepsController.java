package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.util.ModuleUtil;
import com.crm.util.ActionUtil;

/**
 * 
 * 财务导航模块
 * 
 * User: zhujun
 * Date: 2012-8-28
 * Time: 下午9:07:55
 */
@Controller
@RequestMapping(value = "crm/module/fsteps")
public class XmFstepsController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(int ptb,ModelMap modelMap){
		
		ActionUtil.setTitle2("Fsteps", ptb, modelMap, this.moduleUtil);
		
		return "module/fsteps/index";
	}
	
}

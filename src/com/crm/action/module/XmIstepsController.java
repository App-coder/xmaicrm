package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.util.ModuleUtil;
import com.crm.util.ActionUtil;

/**
 * 库存导航
 * 
 * User: zhangjun
 * Date: 2012-8-23
 * Time: 下午22:04:36
 */
@Controller
@RequestMapping(value = "crm/module/isteps")
public class XmIstepsController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(int ptb,ModelMap modelMap){
		
		ActionUtil.setTitle2("Isteps", ptb, modelMap, this.moduleUtil);
		
		return "module/isteps/index";
	}
	
	
}

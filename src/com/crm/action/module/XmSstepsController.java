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
 * 销售导航
 * 
 * User: zhujun
 * Date: 2012-8-27
 * Time: 下午5:13:17
 */
@Controller
@RequestMapping(value = "crm/module/ssteps")
public class XmSstepsController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(int ptb,ModelMap modelMap){
		
		ActionUtil.setTitle2("Ssteps", ptb, modelMap, this.moduleUtil);
		
		return "module/ssteps/index";
	}
	
}

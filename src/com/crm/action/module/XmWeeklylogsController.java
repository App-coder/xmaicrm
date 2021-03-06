package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.util.ModuleUtil;
import com.crm.util.ActionUtil;

/**
 * 
 * 周报
 * 
 * User: zhujun
 * Date: 2012-8-25
 * Time: 上午10:46:59
 */
@Controller
@RequestMapping(value = "crm/module/weeklylogs")
public class XmWeeklylogsController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle2("Weeklylogs", ptb, modelMap, this.moduleUtil);
		return "module/weeklylogs/index";
	}
	
}

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
 * 日报
 * 
 * User: zhujun
 * Date: 2012-8-28
 * Time: 上午10:27:34
 */
@Controller
@RequestMapping(value = "crm/module/dailylogs")
public class XmDailylogsController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle2("Dailylogs", ptb, modelMap, this.moduleUtil);
		return "module/dailylogs/index";
	}
	
}

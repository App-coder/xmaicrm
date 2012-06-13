package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.util.ModuleUtil;
import com.crm.util.ActionUtil;

/**
 * 
 * 知识库
 * 
 * User: zhujun
 * Date: 2012-8-3
 * Time: 下午6:57:05
 */
@Controller
@RequestMapping(value = "crm/module/faq")
public class XmFaqController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle2("Faq", ptb, modelMap, this.moduleUtil);

		return "module/faq/index";
	}
	
}

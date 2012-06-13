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
 * 盘点
 * 
 * User: zhujun
 * Date: 2012-8-6
 * Time: 下午9:12:12
 */
@Controller
@RequestMapping(value = "crm/module/checks")
public class XmChecksController {


	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle2("Checks", ptb, modelMap, this.moduleUtil);

		return "module/checks/index";
	}
	
}

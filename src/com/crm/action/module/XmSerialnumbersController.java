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
 * 产品序列号
 * 
 * User: zhujun
 * Date: 2012-8-22
 * Time: 上午11:23:24
 */
@Controller
@RequestMapping(value = "crm/module/serialnumbers")
public class XmSerialnumbersController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Serialnumbers", ptb, modelMap, this.moduleUtil);

		return "module/serialnumbers/index";
	}
}

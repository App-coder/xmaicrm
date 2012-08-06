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
 * 库存台帐
 * 
 * User: zhujun
 * Date: 2012-8-6
 * Time: 下午10:15:20
 */
@Controller
@RequestMapping(value = "crm/module/inventoryledgers")
public class XmInventoryledgersController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle2("Inventoryledgers", ptb, modelMap, this.moduleUtil);

		return "module/inventoryledgers/index";
	}
	
}

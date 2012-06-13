package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.service.module.XmVnotesService;
import com.crm.util.ActionUtil;

/**
 * 供应商联系记录
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午11:19:36
 */
@Controller
@RequestMapping(value = "crm/module/vnotes")
public class XmVnotesController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Vnotes", ptb, modelMap, this.moduleUtil);

		return "module/vnotes/index";
	}
	
}

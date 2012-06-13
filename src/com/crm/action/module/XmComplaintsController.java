package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.service.module.XmComplaintsService;
import com.crm.util.ActionUtil;
/**
 * 
 * 客户投诉
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午7:51:42
 */
@Controller
@RequestMapping(value = "crm/module/complaints")
public class XmComplaintsController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Complaints", ptb, modelMap, this.moduleUtil);

		return "module/complaints/index";
	}

	
}

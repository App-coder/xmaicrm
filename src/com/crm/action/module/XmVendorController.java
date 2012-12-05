package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.service.module.XmVendorService;
import com.crm.util.ActionUtil;
/**
 * 
 * 供货商控制器
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午10:52:10
 */
@Controller
@RequestMapping(value = "crm/module/vendors")
public class XmVendorController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Vendors", ptb, modelMap, this.moduleUtil);

		return "module/vendors/index";
	}
	
}

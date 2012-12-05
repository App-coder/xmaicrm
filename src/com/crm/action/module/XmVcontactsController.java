package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.service.module.XmVcontactsService;
import com.crm.util.ActionUtil;

/**
 * 供货商联系人
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午11:00:30
 */
@Controller
@RequestMapping(value = "crm/module/vcontacts")
public class XmVcontactsController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Vcontacts", ptb, modelMap, this.moduleUtil);

		return "module/vcontacts/index";
	}
	
}

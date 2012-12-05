package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.service.module.XmOpeningbalancessService;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
/**
 * 
 * 期初余额
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午9:28:31
 */
@Controller
@RequestMapping(value = "crm/module/openingbalancess")
public class XmOpeningbalancessController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	ActionCls actionCls;
	@Resource(name = "actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Openingbalancess", ptb, modelMap, this.moduleUtil);

		return "module/openingbalancess/index";
	}
	
}

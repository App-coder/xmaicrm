package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmBillings;
import com.crm.model.XmCustomview;
import com.crm.model.XmTab;
import com.crm.service.XmCustomViewService;
import com.crm.service.module.XmBillingsService;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.crm.CustomViewUtil;

/**
 * 
 * 发票控制器
 * 
 * User: zhujun
 * Date: 2012-8-18
 * Time: 上午9:29:44
 */
@Controller
@RequestMapping(value = "crm/module/billings")
public class XmBillingsController extends BaseController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle("Billings", ptb, modelMap, this.moduleUtil);

		return "module/billings/index";
	}
	
	
}

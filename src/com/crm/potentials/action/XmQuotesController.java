package com.crm.potentials.action;

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
import com.crm.model.XmCustomview;
import com.crm.model.XmQuotes;
import com.crm.potentials.service.XmQuotesService;
import com.crm.service.XmCustomViewService;

@Controller
@RequestMapping(value = "quotes")
public class XmQuotesController extends BaseController{
	
	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	XmQuotesService xmQuotesService;
	@Resource(name="xmQuotesService")
	public void setXmQuotesService(XmQuotesService xmQuotesService) {
		this.xmQuotesService = xmQuotesService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		this.moduleUtil.setViewProp(modelMap,"Quotes");
		return "potential/quotes";
	}
	
	
	
}

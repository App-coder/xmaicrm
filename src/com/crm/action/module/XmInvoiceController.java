package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.model.XmTab;
import com.crm.service.module.XmInvoiceService;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.crm.CustomViewUtil;
@Controller
@RequestMapping(value = "crm/module/invoice")
public class XmInvoiceController extends BaseController{
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmInvoiceService xmInvoiceService;
	@Resource(name="xmInvoiceService")
	public void setXmInvoiceService(XmInvoiceService xmInvoiceService) {
		this.xmInvoiceService = xmInvoiceService;
	}
	
	XmParenttabrelService xmParenttabrelService;
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		if(ptb==-1){
			XmTab tab = CustomViewUtil.getTabByName("Invoice");
			ptb = this.xmParenttabrelService.getPtbByTabid(tab.getTabid());
		}
		
		ActionUtil.setTitle("Invoice", ptb, modelMap, this.moduleUtil);

		return "module/invoice/index";
	}
	
	
}

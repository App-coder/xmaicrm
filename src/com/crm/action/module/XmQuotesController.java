package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.model.XmTab;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CustomViewUtil;

@Controller
@RequestMapping(value = "crm/module/quotes")
public class XmQuotesController extends BaseController{
	
	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	XmParenttabrelService xmParenttabrelService;
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Quotes", ptb, modelMap, this.moduleUtil);

		return "module/quotes/index";
	}
	
	@RequestMapping(value = "/showedit")
	public String showedit(int recordid,String module,int ptb,ModelMap modelmap){
		
		if(ptb==-1){
			XmTab tab = CustomViewUtil.getTabByName("Quotes");
			ptb = this.xmParenttabrelService.getPtbByTabid(tab.getTabid());
		}
		
		this.actionCls.showEdit(ptb, module, modelmap,recordid);
		
		return "module/quotes/edit";
	}
	
}

package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.model.XmTab;
import com.crm.service.module.XmGathersService;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CustomViewUtil;

/**
 * 应收款控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午2:37:01
 */
@Controller
@RequestMapping(value = "crm/module/gathers")
public class XmGathersController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}
	
	XmGathersService xmGathersService;
	@Resource(name="xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}
	
	XmParenttabrelService xmParenttabrelService;
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		if(ptb==-1){
			XmTab tab = CustomViewUtil.getTabByName("Gathers");
			ptb = this.xmParenttabrelService.getPtbByTabid(tab.getTabid());
		}
		
		ActionUtil.setTitle("Gathers", ptb, modelMap, this.moduleUtil);

		return "module/gathers/index";
	}
	
}

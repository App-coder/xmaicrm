package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.util.ModuleUtil;
import com.crm.model.XmCangkus;
import com.crm.model.XmTab;
import com.crm.service.settings.other.XmCangkusService;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CustomViewUtil;

import java.util.*;

/**
 * 
 * 入库单
 * 
 * User: zhujun
 * Date: 2012-8-28
 * Time: 上午10:27:34
 */
@Controller
@RequestMapping(value = "crm/module/warehouses")
public class XmWarehousesController {

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
	
	XmCangkusService xmCangkusService;
	@Resource(name="xmCangkusService")
	public void setXmCangkusService(XmCangkusService xmCangkusService) {
		this.xmCangkusService = xmCangkusService;
	}

	XmParenttabrelService xmParenttabrelService;
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		List<XmCangkus> cangkus = this.xmCangkusService.getCangkus();
		modelMap.addAttribute("cangkus",cangkus);
		
		if(ptb==-1){
			XmTab tab = CustomViewUtil.getTabByName("Warehouses");
			ptb = this.xmParenttabrelService.getPtbByTabid(tab.getTabid());
		}
		
		ActionUtil.setTitle("Warehouses", ptb, modelMap, this.moduleUtil);

		return "module/warehouses/index";
	}
	
}

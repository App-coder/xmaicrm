package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.service.module.XmCampaignService;
import com.crm.util.crm.CustomViewUtil;

/**
 * 
 * 营销-营销活动
 * 
 * User: zhujun
 * Date: 2012-8-23
 * Time: 下午10:24:58
 */
@Controller
@RequestMapping(value = "crm/module/campaigns")
public class XmCampaignController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmCampaignService xmCampaignService;
	@Resource(name="xmCampaignService")
	public void setXmCampaignService(XmCampaignService xmCampaignService) {
		this.xmCampaignService = xmCampaignService;
	}
	
	@RequestMapping(value = "/index")
	public String index(String ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		String entitytype = "Campaigns";
		XmTab tab = CustomViewUtil.getTabByName(entitytype);
		this.moduleUtil.setViewProp(modelMap, entitytype, tab);
		XmEntityname entityname = CustomViewUtil.getEntitynameByET(entitytype);
		modelMap.addAttribute("tab", tab);
		modelMap.addAttribute("viewid", entityname.getEntityidfield());
		modelMap.addAttribute("entitytype", entitytype);
		modelMap.addAttribute("entityname", entityname);
		
		modelMap.addAttribute("ptb",new String(ptb.getBytes("ISO-8859-1"),
				"utf-8"));
		return "public/viewcv";
	}
}

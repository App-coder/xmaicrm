package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.model.XmEntityname;
import com.crm.service.module.XmCampaignService;
import com.crm.util.ActionUtil;
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
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle("Campaigns", ptb, modelMap, this.moduleUtil);

		return "public/viewcv";
	}
}

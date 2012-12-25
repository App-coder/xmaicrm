package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmPotential;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
import com.crm.service.module.XmPotentialService;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.crm.CustomViewUtil;

@Controller
@RequestMapping(value = "crm/module/potentials")
public class XmPotentialController extends BaseController  {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmPotentialService xmPotentialService;
	@Resource(name="xmPotentialService")
	public void setXmPotentialService(XmPotentialService xmPotentialService) {
		this.xmPotentialService = xmPotentialService;
	}
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}

	XmParenttabrelService xmParenttabrelService;
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}


	/**
	 * 销售漏斗
	 */
	@RequestMapping(value = "/funnel", method = RequestMethod.GET)
	public String funnel(){
		return "potential/funnel";
	}
	
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		if(ptb==-1){
			XmTab tab = CustomViewUtil.getTabByName("Potentials");
			ptb = this.xmParenttabrelService.getPtbByTabid(tab.getTabid());
		}
		
		ActionUtil.setTitle("Potentials", ptb, modelMap, this.moduleUtil);

		return "module/potentials/index";
	}
	
	/**
	 * 
	 * 营销活动 相关信息-销售机会
	 * 
	 * @param page
	 * @param rows
	 * @param crmid
	 * @return
	 */
	@RequestMapping(value = "/getOpportunities")
	@ResponseBody
	public String getOpportunities(int page,int rows,int crmid){
		
		ListBean bean = new ListBean();
		int total = this.xmPotentialService.getTotalForOpportunities(crmid);
		List<XmPotential> potentials = this.xmPotentialService.getOpportunities(page,rows,crmid);
		
		bean.setTotal(total);
		bean.setRows(potentials);
		
		return JSON.toJSONString(bean);
	}
	
	
	/**
	 * 
	 * 营销活动-关联销售机会列表页面
	 * 
	 * @param crmid
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/related/campaign")
	public String relCampaign(int crmid,ModelMap modelMap){
		return "module/potentials/related/campaign";
	}
	
}

package com.crm.marketing.action;

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
import com.crm.marketing.service.XmCampaignService;
import com.crm.model.XmCampaign;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;

/**
 * 
 * 营销-营销活动
 * 
 * User: zhujun
 * Date: 2012-8-23
 * Time: 下午10:24:58
 */
@Controller
@RequestMapping(value = "campaign")
public class XmCampaignController extends BaseController {
	
	XmCampaignService xmCampaignService;
	@Resource(name="xmCampaignService")
	public void setXmCampaignService(XmCampaignService xmCampaignService) {
		this.xmCampaignService = xmCampaignService;
	}

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
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		this.moduleUtil.setViewProp(modelMap,"Campaigns");
		return "marketing/campaigns";
	}
	
	/**
	 * 根据视图ID返回对应的JSON
	 * 
	 * @param page 页数
	 * @param rows 行数
	 * @param viewid 视图ID
	 * @return
	 */
	@RequestMapping(value = "/renderView", method = RequestMethod.POST)
	@ResponseBody
	public String renderView(int page,int rows,String entitytype,int viewid){
		
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(entitytype,viewid);
		
		int total = this.xmCampaignService.getTotal(viewid);
		List<XmCampaign> ls = this.xmCampaignService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
}

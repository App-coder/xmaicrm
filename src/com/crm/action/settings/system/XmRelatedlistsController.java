package com.crm.action.settings.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmRelatedlists;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
import com.crm.service.settings.system.XmRelatedlistsService;

/**
 * 
 * 系统设置-相关信息
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:57:00
 */
@Controller
@RequestMapping(value = "crm/settings/relatedlists")
public class XmRelatedlistsController extends BaseController {
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}

	XmRelatedlistsService xmRelatedlistsService;
	@Resource(name="xmRelatedlistsService")
	public void setXmRelatedlistsService(XmRelatedlistsService xmRelatedlistsService) {
		this.xmRelatedlistsService = xmRelatedlistsService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmTab> modules = this.xmTabService.getRelatedModule();
		modelMap.addAttribute("modules",modules);
		
		return "settings/system/relatedlists";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int tabid){
		
		List<XmRelatedlists> relatedlist = this.xmRelatedlistsService.getRelatedByTabid(tabid);
		ListBean bean = new ListBean();
		bean.setRows(relatedlist);
		bean.setTotal(relatedlist.size());
		
		return JSON.toJSONString(bean);
	}
	
	
}

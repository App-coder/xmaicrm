package com.crm.settings.basic.action;

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
import com.crm.model.XmCustomsharings;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
import com.crm.settings.basic.service.XmCustomsharingsService;

/**
 * 
 * 基本设置-自定义共享规则
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:17:26
 */
@Controller
@RequestMapping(value = "crm/settings/customsharings")
public class XmCustomsharingsController extends BaseController {
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	XmCustomsharingsService xmCustomsharingsService;
	@Resource(name="xmCustomsharingsService")
	public void setXmCustomsharingsService(
			XmCustomsharingsService xmCustomsharingsService) {
		this.xmCustomsharingsService = xmCustomsharingsService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmTab> sharemodules = this.xmTabService.getCustomsharingsModule();
		modelMap.addAttribute("sharemodule",sharemodules);
		
		return "settings/basic/customsharings";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(int tabid){
		List<XmCustomsharings> sharings = this.xmCustomsharingsService.getShares(tabid);
		ListBean bean = new ListBean();
		bean.setRows(sharings);
		bean.setTotal(sharings.size());
		return JSON.toJSONString(bean);
	}
	
}

package com.crm.action.settings.basic;

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
import com.crm.service.settings.basic.XmDefOrgShareService;

/**
 * 
 * 基本设置-全局共享规则
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:16:00
 */
@Controller
@RequestMapping(value = "crm/settings/deforgshare")
public class XmDefOrgShareController extends BaseController {
	
	XmDefOrgShareService xmDefOrgShareService;
	@Resource(name="xmDefOrgShareService")
	public void setXmDefOrgShareService(XmDefOrgShareService xmDefOrgShareService) {
		this.xmDefOrgShareService = xmDefOrgShareService;
	}
	

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/basic/deforgshare";
	}
	
	@RequestMapping(value = "/loadData", method = RequestMethod.POST)
	@ResponseBody
	public String loadData(){
		
		List<Object> sharerules = this.xmDefOrgShareService.getShareRules();
		ListBean bean = new ListBean();
		bean.setTotal(sharerules.size());
		bean.setRows(sharerules);
		
		return JSON.toJSONString(bean);
	}
	
}

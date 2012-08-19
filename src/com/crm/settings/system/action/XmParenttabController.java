package com.crm.settings.system.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmParenttab;
import com.crm.settings.system.service.XmParenttabService;

/**
 * 系统定制-主菜单
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:30:12
 */
@Controller
@RequestMapping(value = "crm/settings/parenttab")
public class XmParenttabController {
	
	XmParenttabService xmParenttabService;
	@Resource(name="xmParenttabService")
	public void setXmParenttabService(XmParenttabService xmParenttabService) {
		this.xmParenttabService = xmParenttabService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/parenttab";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		
		List<XmParenttab> tabs = this.xmParenttabService.getAll();

		ListBean bean = new ListBean();
		bean.setTotal(tabs.size());
		bean.setRows(tabs);
		
		return JSON.toJSONString(bean);
	}
	
}

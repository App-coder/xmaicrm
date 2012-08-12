package com.crm.settings.other.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCurrencyInfo;
import com.crm.model.XmEmailtemplates;
import com.crm.settings.other.service.XmCurrencyInfoService;

/**
 * User: 货币币种 
 * Date: 2012-8-12
 * Time: 下午9:27:20
 */
@Controller
@RequestMapping(value = "settings/currencyInfo")
public class XmCurrencyInfoController {
	
	XmCurrencyInfoService xmCurrencyInfoService;
	@Resource(name="xmCurrencyInfoService")
	public void setXmCurrencyInfoService(XmCurrencyInfoService xmCurrencyInfoService) {
		this.xmCurrencyInfoService = xmCurrencyInfoService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/other/currencyinfo";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(ModelMap modelMap){
		List<XmCurrencyInfo> list = this.xmCurrencyInfoService.getAll();
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return JSON.toJSONString(bean);
	}
	
}

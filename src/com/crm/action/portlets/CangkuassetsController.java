package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.service.settings.other.XmCangkusService;

/**
 * 库存资产
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:37:57
 */
@Controller
@RequestMapping(value = "crm/portlets/cangkuassets")
public class CangkuassetsController {
	
	XmCangkusService xmCangkusService;
	@Resource(name="xmCangkusService")
	public void setXmCangkusService(XmCangkusService xmCangkusService) {
		this.xmCangkusService = xmCangkusService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/cangkuassets";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		ListBean bean = new ListBean();
		List<Object> objs = this.xmCangkusService.getCangkussets();
		bean.setRows(objs);
		bean.setTotal(objs.size());
		return JSON.toJSONString(bean);
	}
	
}

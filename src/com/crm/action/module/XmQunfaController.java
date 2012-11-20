package com.crm.action.module;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmParenttab;
import com.crm.model.XmQunfa;
import com.crm.service.module.XmQunfaService;
import com.crm.util.ActionUtil;
import com.crm.util.CacheManager;
import com.crm.util.Constant;
import com.crm.util.crm.CustomViewUtil;
import java.util.*;
/**
 * 
 * 短信群发
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午8:09:13
 */
@Controller
@RequestMapping(value = "crm/module/qunfas")
public class XmQunfaController {

	XmQunfaService xmQunfaService;
	@Resource(name="xmQunfaService")
	public void setXmQunfaService(XmQunfaService xmQunfaService) {
		this.xmQunfaService = xmQunfaService;
	}

	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap,int ptb){
		
		ActionUtil.setTitle2("Qunfas", ptb, modelMap, this.moduleUtil);
		
		return "module/qunfas/index";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		ListBean bean = new ListBean();
		int total = this.xmQunfaService.getTotal();
		List<XmQunfa> qunfas = this.xmQunfaService.getList(page,rows);
		
		bean.setRows(qunfas);
		bean.setTotal(total);
		
		return JSON.toJSONString(bean);
	}
	
}

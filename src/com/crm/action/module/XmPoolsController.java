package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.service.module.XmAccountService;
import com.crm.util.ActionUtil;
import com.crm.util.DateUtil;

/**
 * 客户池控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午2:37:01
 */
@Controller
@RequestMapping(value = "crm/module/pools")
public class XmPoolsController {

	XmAccountService xmAccountService;
	@Resource(name="xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle2("Pools", ptb, modelMap, this.moduleUtil);

		return "module/pools/index";
	}
	
	@RequestMapping(value = "/loadUnabsorbed")
	@ResponseBody
	public String loadUnabsorbed(int page,int rows){
		ListBean bean = new ListBean();
		int total = this.xmAccountService.getTotalUnabsorbed();
		List<Object> unabsorbed = this.xmAccountService.loadUnabsorbed(page,rows);
		bean.setRows(unabsorbed);
		bean.setTotal(total);
		return JSON.toJSONStringWithDateFormat(unabsorbed,DateUtil.C_DATE_PATTON_DEFAULT);
	}
	
	@RequestMapping(value = "/loadAssigned")
	@ResponseBody
	public String loadAssigned(int page,int rows){
		ListBean bean = new ListBean();
		int total = this.xmAccountService.getTotalAssigned();
		List<Object> assigned = this.xmAccountService.loadAssigned(page,rows);
		bean.setRows(assigned);
		bean.setTotal(total);
		return JSON.toJSONStringWithDateFormat(assigned,DateUtil.C_DATE_PATTON_DEFAULT);
	}
	
}

package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmExpenses;
import com.crm.service.portlets.XmExpensesService;
import com.crm.util.CacheUtil;
import com.crm.util.DateUtil;

import java.util.*;

import javax.annotation.Resource;

/**
 * 
 * 费用报销（30天内）
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 下午2:52:51
 */
@Controller
@RequestMapping(value = "crm/portlets/expensesmonth")
public class ExpensesmonthController {

	XmExpensesService xmExpensesService;
	@Resource(name="com.crm.service.portlets.impl.xmExpensesService")
	public void setXmExpensesService(XmExpensesService xmExpensesService) {
		this.xmExpensesService = xmExpensesService;
	}

	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		
		List<XmExpenses> expenses = this.xmExpensesService.getExpensesmonth();
		bean.setRows(expenses);
		bean.setTotal(expenses.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr; 
	}
	
}

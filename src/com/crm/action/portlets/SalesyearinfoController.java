package com.crm.action.portlets;

import java.util.Calendar;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.portlets.Salesyearinfo;
import com.crm.bean.portlets.salesyearinfo.ExpensesStat;
import com.crm.bean.portlets.salesyearinfo.GatherStat;
import com.crm.bean.portlets.salesyearinfo.SalesorderStat;
import com.crm.model.XmAccount;
import com.crm.service.module.XmAccountService;
import com.crm.service.module.XmExpensesService;
import com.crm.service.module.XmSalesorderService;
import com.crm.service.portlets.XmGathersService;

/**
 * 公司年度销售情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:40:20
 */
@Controller
@RequestMapping(value = "crm/portlets/salesyearinfo")
public class SalesyearinfoController {
	
	XmGathersService xmGathersService;
	@Resource(name="com.crm.service.portlets.impl.xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}
	
	XmExpensesService xmExpensesService;
	@Resource(name="xmExpensesService")
	public void setXmExpensesService(XmExpensesService xmExpensesService) {
		this.xmExpensesService = xmExpensesService;
	}
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}
	
	XmAccountService xmAccountService;
	@Resource(name="xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}

	@RequestMapping(value = "/index")
	public String index() {
		return "portlets/salesyearinfo";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson() {
		Salesyearinfo salesyearinfo = new Salesyearinfo();
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		
		salesyearinfo.setYear(year+"");
		
		GatherStat gatherstat = this.xmGathersService.getGatherStat(""+year);
		ExpensesStat expensesstat = this.xmExpensesService.getExpensesStat(""+year) ;
		SalesorderStat salesorderstat = this.xmSalesorderService.getSalesorderStat(""+year);
		String newaccounts = this.xmAccountService.getNewAccounts(""+year);
		
		salesyearinfo.setNewcustomer(newaccounts);
		salesyearinfo.setSalescount(salesorderstat.getSalescount());
		salesyearinfo.setSalessumtotle(salesorderstat.getSalessumtotle());
		salesyearinfo.setSumexpensestotal(expensesstat.getSumexpensestotal());
		salesyearinfo.setSumgathersactual(gatherstat.getSumgathersactual());
		
		return JSON.toJSONString(salesyearinfo);
	}
	
}

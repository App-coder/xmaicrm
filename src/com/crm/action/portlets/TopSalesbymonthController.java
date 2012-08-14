package com.crm.action.portlets;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.amcharts.portlets.Salesbymonth;
import com.crm.model.XmSalesorder;
import com.crm.service.module.XmSalesorderService;
import com.crm.util.DateUtil;

/**
 * 
 * 公司最近6个月销售情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:29:06
 */
@Controller
@RequestMapping(value = "crm/portlets/top_salesbymonth")
public class TopSalesbymonthController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/topsalesbymonth";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		
		List<Salesbymonth> salesbymonths = new ArrayList<Salesbymonth>();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -6);
		
		String today = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		String prev = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		
		List<Salesbymonth> salesbymonth = this.xmSalesorderService.getTopSalesByMonth(prev,today);
		
		return JSON.toJSONString(salesbymonth);
	}
	
	
	

}

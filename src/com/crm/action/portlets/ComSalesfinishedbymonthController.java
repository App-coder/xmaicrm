package com.crm.action.portlets;

import java.util.Calendar;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.amcharts.portlets.Salesfinishedbymonth;
import com.crm.model.XmSalesorder;
import com.crm.service.module.XmSalesorderService;
import com.crm.util.DateUtil;
import com.crm.util.time.TimeGet;
import java.util.*;

import javax.annotation.Resource;

/**
 * 
 * 公司最近6个月销售任务完成情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:16:56
 * 
 */
@Controller
@RequestMapping(value = "crm/portlets/com_salesfinishedbymonth")
public class ComSalesfinishedbymonthController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/comsalesfinishedbymonth";
	}
	
	@RequestMapping(value = "/getInfo")
	@ResponseBody
	public String getInfo(){
		
		List<Salesfinishedbymonth> salesfinishedbymonth = new ArrayList<Salesfinishedbymonth>();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -6);
		TimeGet timeget = new TimeGet();
		
		String year = null;
		String month = null;
		String firstDayOfMonth = null;
		String lastDayOfMonth = null;
		
		for(int i=1;i<=6;i++){
			calendar.add(Calendar.MONTH,1);

			Salesfinishedbymonth mon = new Salesfinishedbymonth();
			
			year = calendar.get(Calendar.YEAR)+"";
			month = (calendar.get(Calendar.MONTH)+1)<10?("0"+(calendar.get(Calendar.MONTH)+1)):(calendar.get(Calendar.MONTH)+1)+"";
			
			firstDayOfMonth = timeget.getFirstDayOfMonth(calendar);
			lastDayOfMonth = timeget.getLastDayOfMonth(calendar);
			
			mon.setMonth(year+"-"+month);
			
			mon.setSum(this.xmSalesorderService.getSum(year,month));
			mon.setFinished(this.xmSalesorderService.getFinished(firstDayOfMonth,lastDayOfMonth));
			
			mon.setColorOfFinished("#A17C0C");
			mon.setColorOfSum("#728DA2");
			
			salesfinishedbymonth.add(mon);
		}
		
		return JSON.toJSONString(salesfinishedbymonth);
	}
	
}

package com.crm.action.portlets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.amcharts.chartdata.CD_Salesyear;
import com.crm.bean.amcharts.portlets.Salesyear;
import com.crm.service.module.XmSalesorderService;

/**
 * 公司销售额月度同比
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:30:51
 */
@Controller
@RequestMapping(value = "crm/portlets/salesyear")
public class SalesyearController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/salesyear";
	}

	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		
		Calendar calendar = Calendar.getInstance();
		
		String year = calendar.get(Calendar.YEAR)+"";
		calendar.add(Calendar.YEAR, -1);
		String lastyear = calendar.get(Calendar.YEAR)+"";
		
		List<Salesyear> years = this.xmSalesorderService.getSalesOfYear(year); 
		List<Salesyear> lastyears = this.xmSalesorderService.getSalesOfYear(lastyear); 
		
		List<CD_Salesyear> objs = new ArrayList<CD_Salesyear>();
		String monstr = "";
		for(int i=1;i<=12;i++){
			CD_Salesyear s = new CD_Salesyear();
			monstr = i<10?"0"+i:i+"";
			s.setDuedate(monstr);
			
			Boolean ly = false;
			if(lastyears.size()>0){
				for(int j=0;j<lastyears.size();j++){
					if(lastyears.get(j).getDuedate().equals(monstr)){
						s.setLastyearsalescount(lastyears.get(j).getSalescount());
						s.setLastyearsalessumtotal(lastyears.get(j).getSalessumtotal());
						ly = true;
					}
				}
				
			}
			if(!ly){
				s.setLastyearsalescount(new BigDecimal(0));
				s.setLastyearsalessumtotal(new BigDecimal(0));
			}
			
			
			Boolean y = false;
			if(years.size()>0){
				for(int j=0;j<years.size();j++){
					if(years.get(j).getDuedate().equals(monstr)){
						s.setYearsalescount(years.get(j).getSalescount());
						s.setYearsalessumtotal(years.get(j).getSalessumtotal());
						y = true;
					}
				}
			}
			if(!y){
				s.setYearsalescount(new BigDecimal(0));
				s.setYearsalessumtotal(new BigDecimal(0));
			}
			
			objs.add(s);
			
		}
		return JSON.toJSONString(objs);
	}
	
}

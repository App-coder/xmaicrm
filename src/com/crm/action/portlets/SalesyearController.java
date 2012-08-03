package com.crm.action.portlets;

import java.io.UnsupportedEncodingException;
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
	
	@RequestMapping(value = "/getXml")
	@ResponseBody
	public String getXml(){
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer categories = new StringBuffer();
		categories.append("<categories>");
		StringBuffer lastyear = new StringBuffer();
		lastyear.append("<dataset seriesName='去年' color='AFD8F8' showValues='0'>");
		StringBuffer year = new StringBuffer();
		year.append("<dataset seriesName='今年' color='F6BD0F' showValues='0'>");
		
		Calendar calendar = Calendar.getInstance();
		
		String cal_year = calendar.get(Calendar.YEAR)+"";
		calendar.add(Calendar.YEAR, -1);
		String cal_lastyear = calendar.get(Calendar.YEAR)+"";
		
		List<Salesyear> arr_years = this.xmSalesorderService.getSalesOfYear(cal_year); 
		List<Salesyear> arr_lastyears = this.xmSalesorderService.getSalesOfYear(cal_lastyear); 
		
		String monstr = "";
		for(int i=1;i<=12;i++){
			
			monstr = i<10?"0"+i:i+"";
			categories.append("<category label='"+monstr+"' />");
			
			Boolean ly = false;
			if(arr_lastyears.size()>0){
				for(int j=0;j<arr_lastyears.size();j++){
					if(arr_lastyears.get(j).getDuedate().equals(monstr)){
						lastyear.append("<set value='"+arr_lastyears.get(j).getSalessumtotal()+"' />");
						ly = true;
					}
				}
			}
			if(!ly){
				lastyear.append("<set value='0' />");
			}
			
			Boolean y = false;
			if(arr_years.size()>0){
				for(int j=0;j<arr_years.size();j++){
					if(arr_years.get(j).getDuedate().equals(monstr)){
						year.append("<set value='"+arr_years.get(j).getSalessumtotal()+"' />");
						y = true;
					}
				}
			}
			if(!y){
				year.append("<set value='0' />");
			}
		}
		
		categories.append("</categories>");
		lastyear.append("</dataset>");
		year.append("</dataset>");
		
		sb.append("<graph caption='销售额月度同比(已审批)' labelDisplay='WRAP' shownames='1' showvalues='0' decimals='0' numDivLines='4' formatNumberScale='0' decimalPrecision='0' anchorSides='0' anchorRadius='3' anchorBorderColor='009900' outCnvBaseFontSize='12' baseFontSize='12'>");
		sb.append(categories.toString());
		sb.append(lastyear.toString());
		sb.append(year.toString());
		sb.append("</graph>");
		
		byte[] utf8Bom = new byte[]{(byte) 0xef, (byte) 0xbb, (byte) 0xbf};
        String utf8BomStr = "";
        try {
            utf8BomStr = new String(utf8Bom, "UTF-8");//定义BOM标记
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
		
		return utf8BomStr+sb.toString();
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

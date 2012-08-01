package com.crm.action.portlets;

import java.io.UnsupportedEncodingException;
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
	
	@RequestMapping(value = "/getXml")
	@ResponseBody
	public String getXml(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("<graph labelDisplay='WRAP' showvalues='0' numDivLines='4' formatNumberScale='0' decimalPrecision='0' anchorSides='10'  anchorRadius='3' anchorBorderColor='009900' outCnvBaseFontSize='12' baseFontSize='12'>");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -6);
		
		String today = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		String prev = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		
		List<Salesbymonth> salesbymonth = this.xmSalesorderService.getTopSalesByMonth(prev,today);
		
		StringBuffer categories = new StringBuffer();
		StringBuffer ordersum = new StringBuffer();
		StringBuffer ordercount = new StringBuffer();
		
		categories.append("<categories>");
		ordersum.append("<dataset seriesName='合同订单金额' color='AFD8F8' showValues='0'>");
		ordercount.append("<dataset seriesName='合同订单数量' color='8BBA00' showValues='0' parentYAxis='S'>");
		for(int i=0;i<6;i++){
			categories.append("<category name='"+DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT)+"' />");
			
			boolean exist = false;
			for(int j=0;j<salesbymonth.size();j++){
				if(salesbymonth.get(j).getM().equals(DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_YYYYMM))){
					ordersum.append("<set value='"+salesbymonth.get(j).getTotal()+"' />");
					ordercount.append("<set value='"+salesbymonth.get(j).getSo_count()+"' />");
					exist = true;
				}
			}
			
			if(!exist){
				ordersum.append("<set value='0' />");
				ordercount.append("<set value='0' />");
			}
			
			calendar.add(Calendar.MONTH, 1);
		}
		ordersum.append("</dataset>");
		ordercount.append("</dataset>");
		categories.append("</categories>");
		
		sb.append(categories.toString());
		sb.append(ordersum.toString());
		sb.append(ordercount.toString());
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
	

}

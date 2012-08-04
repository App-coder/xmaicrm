package com.crm.action.portlets;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.amcharts.portlets.Gathersyear;
import com.crm.bean.crm.portlets.GatherYear;
import com.crm.service.portlets.XmGathersService;
import com.crm.util.CacheUtil;

/**
 * 公司应收款月度同比
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:19:34
 */
@Controller
@RequestMapping(value = "crm/portlets/gathersyear")
public class GathersyearController {
	
	XmGathersService xmGathersService;
	@Resource(name="com.crm.service.portlets.impl.xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/gathersyear";
	}
	
	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
	@ResponseBody
	public String getJson(){
		
		List<List<GatherYear>> yearGathers = this.xmGathersService.getYearGather();
		List<Gathersyear> json = new ArrayList<Gathersyear>();
		String monstr = "";
		for(int i=1;i<=12;i++){
			monstr = i<10?"0"+i:i+"";
			
			Gathersyear gather = new Gathersyear();
			gather.setMonth(monstr);
			
			List<GatherYear> yGathers = yearGathers.get(0);
			Boolean ytrue = false;
			for(int j=0;j<yGathers.size();j++){
				if(monstr.equals(yGathers.get(j).getDuedate())){
					gather.setYearGather(yGathers.get(j).getSumplanamount());
					ytrue = true;
					break;
				}
			}
			if(!ytrue){
				gather.setYearGather(new BigDecimal(0));
			}
			
			List<GatherYear> lastYearGathers = yearGathers.get(1);
			Boolean lytrue = false;
			for(int j=0;j<lastYearGathers.size();j++){
				if(monstr.equals(lastYearGathers.get(j).getDuedate())){
					gather.setLastYearGather(lastYearGathers.get(j).getSumactualamount());
					lytrue = true;
					break;
				}
			}
			
			if(!lytrue){
				gather.setLastYearGather(new BigDecimal(0));
			}
			
			gather.setColorOfLastYear("#728DA2");
			gather.setColorOfYear("#A17C0C");
			json.add(gather);
		}
		
		return JSON.toJSONString(json);
	}
	
	@RequestMapping(value = "/getXml", method = RequestMethod.GET)
	@ResponseBody
	public String getXml(){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer categories = new StringBuffer();
		categories.append("<categories font=\"Arial\" fontSize=\"11\" fontColor=\"000000\">");
		
		StringBuffer year = new StringBuffer();
		year.append("<dataset seriesname=\"今年\"  color='F6BD0F'  >");
		
		StringBuffer lastyear = new StringBuffer();
		lastyear.append("<dataset seriesName='去年' color='AFD8F8' >");
		
		List<List<GatherYear>> yearGathers = this.xmGathersService.getYearGather();
		String monstr = "";
		for(int i=1;i<=12;i++){
			monstr = i<10?"0"+i:i+"";
			categories.append("<category name=\""+monstr+"\" />");
			
			List<GatherYear> yGathers = yearGathers.get(0);
			Boolean ytrue = false;
			for(int j=0;j<yGathers.size();j++){
				if(monstr.equals(yGathers.get(j).getDuedate())){
					year.append("<set value=\""+yGathers.get(j).getSumplanamount()+"\" />");
					ytrue = true;
					break;
				}
			}
			if(!ytrue){
				year.append("<set value=\"0\" />");
			}
			
			List<GatherYear> lastYearGathers = yearGathers.get(1);
			Boolean lytrue = false;
			for(int j=0;j<lastYearGathers.size();j++){
				if(monstr.equals(lastYearGathers.get(j).getDuedate())){
					lastyear.append("<set value=\""+lastYearGathers.get(j).getSumactualamount()+"\" />");
					lytrue = true;
					break;
				}
			}
			if(!lytrue){
				lastyear.append("<set value=\"0\" />");
			}
			
		}
		year.append("</dataset>");
		lastyear.append("</dataset>");
		categories.append("</categories>");
		
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<graph caption='应收款月度同比(已收)' labelDisplay='WRAP' shownames='1' showvalues='0' decimals='0' numDivLines='4' formatNumberScale='0' decimalPrecision='0' anchorSides='0' anchorRadius='3' anchorBorderColor='009900' outCnvBaseFontSize='12' baseFontSize='12'>");
		sb.append(categories.toString());
		sb.append(year.toString());
		sb.append(lastyear.toString());
		sb.append("</graph>");
		
        byte[] utf8Bom = new byte[]{(byte) 0xef, (byte) 0xbb, (byte) 0xbf};
        String utf8BomStr = "";
        try {
            utf8BomStr = new String(utf8Bom, "UTF-8");//定义BOM标记
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        String cachestr = utf8BomStr+sb.toString();
        CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
        
		return cachestr;
	}

}

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.amcharts.portlets.Gathersfinishedbymonth;
import com.crm.service.portlets.XmGathersService;
import com.crm.util.CacheUtil;
import com.crm.util.time.TimeGet;

/**
 * 公司最近6个月回款任务完成情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:23:39
 */
@Controller
@RequestMapping(value = "crm/portlets/com_gathersfinishedbymonth")
public class ComGathersfinishedbymonthController {

	XmGathersService xmGathersService;
	@Resource(name="com.crm.service.portlets.impl.xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}
	
	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/comgathersfinishedbymonth";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getInfo(){
		
		List<Gathersfinishedbymonth> gathersfinishedbymonth = new ArrayList<Gathersfinishedbymonth>();
		
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

			Gathersfinishedbymonth mon = new Gathersfinishedbymonth();
			
			year = calendar.get(Calendar.YEAR)+"";
			month = (calendar.get(Calendar.MONTH)+1)<10?("0"+(calendar.get(Calendar.MONTH)+1)):(calendar.get(Calendar.MONTH)+1)+"";
			
			firstDayOfMonth = timeget.getFirstDayOfMonth(calendar);
			lastDayOfMonth = timeget.getLastDayOfMonth(calendar);
			
			mon.setMonth(year+"-"+month);
			
			mon.setSum(this.xmGathersService.getSum(year,month));
			mon.setFinished(this.xmGathersService.getFinished(firstDayOfMonth,lastDayOfMonth));
			
			mon.setColorOfFinished("#A17C0C");
			mon.setColorOfSum("#728DA2");
			
			gathersfinishedbymonth.add(mon);
		}
		
		return JSON.toJSONString(gathersfinishedbymonth);
	}
	
	@RequestMapping(value = "/getXml", method = RequestMethod.GET)
	@ResponseBody
	public String getXml(){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		StringBuffer sb = new StringBuffer();
		TimeGet timeget = new TimeGet();
		
		StringBuffer categories = new StringBuffer();
		categories.append("<categories>");
		StringBuffer aim = new StringBuffer();
		aim.append("<dataset seriesName='目标' color='AFD8F8' showValues='0'>");
		StringBuffer finished = new StringBuffer();
		finished.append("<dataset seriesName='完成' color='F6BD0F' showValues='0'>");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -6);
		
		sb.append("<graph caption='回款任务完成情况统计图' labelDisplay='WRAP' shownames='1' showvalues='0' decimals='0' numDivLines='4' formatNumberScale='0' decimalPrecision='0' anchorSides='10' anchorRadius='3' anchorBorderColor='009900' outCnvBaseFontSize='12' baseFontSize='12'>");
		
		
		String year = null;
		String month = null;
		String firstDayOfMonth = null;
		String lastDayOfMonth = null;
		
		for(int i=1;i<=6;i++){
			
			year = calendar.get(Calendar.YEAR)+"";
			month = (calendar.get(Calendar.MONTH)+1)<10?("0"+(calendar.get(Calendar.MONTH)+1)):(calendar.get(Calendar.MONTH)+1)+"";
			
			firstDayOfMonth = timeget.getFirstDayOfMonth(calendar);
			lastDayOfMonth = timeget.getLastDayOfMonth(calendar);
			
			categories.append("<category label='"+year+"-"+month+"' />");
			String aimval = this.xmGathersService.getSum(year,month);
			String aimv = aimval==null?"0":aimval;
			
			String fstr = this.xmGathersService.getFinished(firstDayOfMonth,lastDayOfMonth);
			String fv = fstr == null?"0":fstr;
			
			
			aim.append("<set value='"+aimv+"' />");
			finished.append("<set value='"+fv+"' />");
			calendar.add(Calendar.MONTH,1);
		}
		categories.append("</categories>");
		aim.append("</dataset>");
		finished.append("</dataset>");
		sb.append(categories.toString());
		sb.append(aim.toString());
		sb.append(finished.toString());
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

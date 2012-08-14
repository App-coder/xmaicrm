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
import com.crm.bean.amcharts.portlets.Gathersfinishedbymonth;
import com.crm.bean.amcharts.portlets.Salesfinishedbymonth;
import com.crm.service.portlets.XmGathersService;
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
	
}

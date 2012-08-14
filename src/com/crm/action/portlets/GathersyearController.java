package com.crm.action.portlets;

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

}

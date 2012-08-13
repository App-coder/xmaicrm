package com.crm.action.portlets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.amcharts.portlets.Gathersyear;
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
	
	@RequestMapping(value = "/getJson")
	public String getJson(){
		
		List<List<Map>> yearGathers = this.xmGathersService.getYearGather();
		
		List<Gathersyear> json = new ArrayList<Gathersyear>();
		
		return "";
	}

}

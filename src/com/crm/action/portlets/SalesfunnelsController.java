package com.crm.action.portlets;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.fusionchart.Salesfunnels;
import com.crm.model.XmPicklist;
import com.crm.service.XmPicklistService;
import com.crm.service.module.XmPotentialService;
import com.crm.util.time.TimeGet;

/**
 * 销售漏斗
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:43:32
 * 
 */
@Controller
@RequestMapping(value = "crm/portlets/salesfunnels")
public class SalesfunnelsController {
	
	XmPicklistService xmPicklistService;
	@Resource(name="xmPicklistService")
	public void setXmPicklistService(XmPicklistService xmPicklistService) {
		this.xmPicklistService = xmPicklistService;
	}
	
	XmPotentialService xmPotentialService;
	@Resource(name="xmPotentialService")
	public void setXmPotentialService(XmPotentialService xmPotentialService) {
		this.xmPotentialService = xmPotentialService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelmap){
		
		String[] colors = new String[]{
				"#B1D1EA","#E8BB32","#7DA113","#EC935B","#F2BE9D","#E57F3E","#299898","#C37676","#A23535","#905890","#517B23","#A39C19"
		};
		List<Salesfunnels> salesfunnels = new ArrayList<Salesfunnels>();
		List<XmPicklist> picks = this.xmPicklistService.getPicks("sales_stage");
		List<Object> ids = new ArrayList<Object>();
		ids.add(1);
		
		TimeGet tg = new TimeGet();
		String fd = tg.getFirstDayOfMonth();
		String ld = tg.getDefaultDay();
		
		
		for(int i=0;i<picks.size();i++){
			if(!picks.get(i).equals("无")){
				Salesfunnels s = new Salesfunnels();
				s.setName(picks.get(i).getColvalue());
				String value = this.xmPotentialService.getSalesCountByPick(picks.get(i).getColvalue(),ids,fd,ld);
				if(value.equals("0")){
					value = "0.001";
				}
				s.setValue(value);
				s.setColor(colors[i]);
				salesfunnels.add(s);
			}
		}
		
		modelmap.addAttribute("res",JSON.toJSONString(salesfunnels));
		
		return "portlets/salesfunnels";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		String[] colors = new String[]{
				"#B1D1EA","#E8BB32","#7DA113","#EC935B","#F2BE9D","#E57F3E","#299898","#C37676","#A23535","#905890","#517B23","#A39C19"
		};
		List<Salesfunnels> salesfunnels = new ArrayList<Salesfunnels>();
		List<XmPicklist> picks = this.xmPicklistService.getPicks("sales_stage");
		List<Object> ids = new ArrayList<Object>();
		ids.add(1);
		
		TimeGet tg = new TimeGet();
		String fd = tg.getFirstDayOfMonth();
		String ld = tg.getDefaultDay();
		
		
		for(int i=0;i<picks.size();i++){
			if(!picks.get(i).equals("无")){
				Salesfunnels s = new Salesfunnels();
				s.setName(picks.get(i).getColvalue());
				s.setValue(this.xmPotentialService.getSalesCountByPick(picks.get(i).getColvalue(),ids,fd,ld));
				s.setColor(colors[i]);
				salesfunnels.add(s);
			}
		}
		
		return JSON.toJSONString(salesfunnels);
	}
	
}

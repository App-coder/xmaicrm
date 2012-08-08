package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
import com.crm.service.module.XmPotentialService;

@Controller
@RequestMapping(value = "potential")
public class XmPotentialController extends BaseController  {
	
	
	XmPotentialService xmPotentialService;
	@Resource(name="xmPotentialService")
	public void setXmPotentialService(XmPotentialService xmPotentialService) {
		this.xmPotentialService = xmPotentialService;
	}

	
	/**
	 * 销售导航
	 */
	@RequestMapping(value = "/nav", method = RequestMethod.GET)
	public String nav(){
		return "potential/nav";
	}
	
	/**
	 * 销售漏斗
	 */
	@RequestMapping(value = "/funnel", method = RequestMethod.GET)
	public String funnel(){
		return "potential/funnel";
	}
	
	
}

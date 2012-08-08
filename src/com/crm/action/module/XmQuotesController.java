package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmQuotesService;

@Controller
@RequestMapping(value = "quotes")
public class XmQuotesController extends BaseController{
	
	XmQuotesService xmQuotesService;
	@Resource(name="xmQuotesService")
	public void setXmQuotesService(XmQuotesService xmQuotesService) {
		this.xmQuotesService = xmQuotesService;
	}

	
	
}

package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmNoteplansService;

@Controller
@RequestMapping(value = "noteplans")
public class XmNoteplansController extends BaseController{
	XmNoteplansService xmNoteplansService;
	@Resource(name="xmNoteplansService")
	public void setXmNoteplansService(XmNoteplansService xmNoteplansService) {
		this.xmNoteplansService = xmNoteplansService;
	}
	
	
}

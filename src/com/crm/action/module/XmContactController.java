package com.crm.action.module;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmContactService;

@Controller
@RequestMapping(value = "contact")
public class XmContactController extends BaseController{
	
	XmContactService xmContactService;
	@Resource(name="xmContactService")
	public void setXmContactService(XmContactService xmContactService) {
		this.xmContactService = xmContactService;
	}
	

}

package com.crm.customer.action;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.customer.service.XmContactService;

@Controller
@RequestMapping(value = "contact")
public class XmContactController extends BaseController{
	
	XmContactService xmContactService;
	@Resource(name="xmContactService")
	public void setXmContactService(XmContactService xmContactService) {
		this.xmContactService = xmContactService;
	}
	

}

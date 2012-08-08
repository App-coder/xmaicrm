package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmInvoiceService;
@Controller
@RequestMapping(value = "invoice")
public class XmInvoiceController extends BaseController{
	
	XmInvoiceService xmInvoiceService;
	@Resource(name="xmInvoiceService")
	public void setXmInvoiceService(XmInvoiceService xmInvoiceService) {
		this.xmInvoiceService = xmInvoiceService;
	}
	
	
}

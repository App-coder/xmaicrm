package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmTuihuosService;
@Controller
@RequestMapping(value = "tuihuos")
public class XmTuihuosController extends BaseController {
	
	XmTuihuosService xmTuihuosService;
	@Resource(name="xmTuihuosService")
	public void setXmTuihuosService(XmTuihuosService xmTuihuosService) {
		this.xmTuihuosService = xmTuihuosService;
	}
	
	
}

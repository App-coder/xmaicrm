package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmDuishousService;
@Controller
@RequestMapping(value = "duishous")
public class XmDuishousController extends BaseController{
	
	XmDuishousService xmDuishousService;
	@Resource(name="xmDuishousService")
	public void setXmDuishousService(XmDuishousService xmDuishousService) {
		this.xmDuishousService = xmDuishousService;
	}
	

}

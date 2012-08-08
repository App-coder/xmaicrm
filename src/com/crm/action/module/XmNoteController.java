package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmNoteService;

@Controller
@RequestMapping(value = "note")
public class XmNoteController extends BaseController{
	
	XmNoteService xmNoteService;
	@Resource(name="xmNoteService")
	public void setXmNoteService(XmNoteService xmNoteService) {
		this.xmNoteService = xmNoteService;
	}
	

}

package com.crm.action.module;


import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.service.module.XmContactService;
import com.crm.util.ActionUtil;

@Controller
@RequestMapping(value = "crm/module/contacts")
public class XmContactController extends BaseController{
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle("Contacts", ptb, modelMap, this.moduleUtil);
		return "public/viewcv";
	}
	
	

}

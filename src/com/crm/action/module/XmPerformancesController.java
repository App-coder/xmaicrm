package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.util.ModuleUtil;
import com.crm.model.XmTab;
import com.crm.service.settings.system.XmParenttabrelService;
import com.crm.util.ActionUtil;
import com.crm.util.crm.CustomViewUtil;

/**
 * 销售-员工绩效
 * 
 * User: zhujun
 * Date: 2012-8-1
 * Time: 下午4:25:25
 */
@Controller
@RequestMapping(value = "crm/module/performances")
public class XmPerformancesController {


	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmParenttabrelService xmParenttabrelService;
	@Resource(name="xmParenttabrelService")
	public void setXmParenttabrelService(XmParenttabrelService xmParenttabrelService) {
		this.xmParenttabrelService = xmParenttabrelService;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {
		
		if(ptb==-1){
			XmTab tab = CustomViewUtil.getTabByName("SalesOrder");
			ptb = this.xmParenttabrelService.getPtbByTabid(tab.getTabid());
		}

		ActionUtil.setTitle2("Performances", ptb, modelMap, this.moduleUtil);

		return "module/performances/index";
	}
	
}

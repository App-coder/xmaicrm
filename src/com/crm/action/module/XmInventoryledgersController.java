package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.util.ModuleUtil;
import com.crm.model.XmCangkus;
import com.crm.service.settings.other.XmCangkusService;
import com.crm.util.ActionUtil;

/**
 * 
 * 库存台帐
 * 
 * User: zhujun
 * Date: 2012-8-6
 * Time: 下午10:15:20
 */
@Controller
@RequestMapping(value = "crm/module/inventoryledgers")
public class XmInventoryledgersController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	XmCangkusService xmCangkusService;
	@Resource(name="xmCangkusService")
	public void setXmCangkusService(XmCangkusService xmCangkusService) {
		this.xmCangkusService = xmCangkusService;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		List<XmCangkus> cangkus = this.xmCangkusService.getCangkus();
		modelMap.addAttribute("cangkus",cangkus);
		
		ActionUtil.setTitle2("Inventoryledgers", ptb, modelMap, this.moduleUtil);

		return "module/inventoryledgers/index";
	}
	
}

package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.util.ModuleUtil;
import com.crm.model.XmTab;
import com.crm.util.ActionUtil;
import com.crm.util.crm.CustomViewUtil;

/**
 * 客户池控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午2:37:01
 */
@Controller
@RequestMapping(value = "crm/module/pools")
public class XmPoolsController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle2("Pools", ptb, modelMap, this.moduleUtil);

		return "module/pools/index";
	}
	
}

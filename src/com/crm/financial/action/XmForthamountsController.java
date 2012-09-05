package com.crm.financial.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
/**
 * 
 * 往来帐
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午9:26:21
 */
@Controller
@RequestMapping(value = "forthamounts")
public class XmForthamountsController extends BaseController {
	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		this.moduleUtil.setViewProp(modelMap,"Gathers");
		return "financial/forthamounts";
	}

}

package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.util.ModuleUtil;
import com.crm.util.ActionUtil;

/**
 * 
 * 初始化库存
 * 
 * User: zhujun
 * Date: 2012-8-6
 * Time: 下午9:22:09
 */
@Controller
@RequestMapping(value = "crm/module/prdtnums")
public class XmPrdtnumsController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle2("Prdtnums", ptb, modelMap, this.moduleUtil);

		return "module/prdtnums/index";
	}
	

}

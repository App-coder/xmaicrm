package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.util.ModuleUtil;
import com.crm.model.XmFaqcategory;
import com.crm.service.module.XmFaqcategorysService;
import com.crm.util.ActionUtil;

/**
 * 
 * 知识库分类
 * 
 * User: zhangjun
 * Date: 2012-8-28
 * Time: 下午20:00
 */
@Controller
@RequestMapping(value = "crm/module/faqcategorys")
public class XmFaqcategorysController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmFaqcategorysService xmFaqcategorysService;
	@Resource(name="xmFaqcategorysService")
	public void setXmFaqcategorysService(XmFaqcategorysService xmFaqcategorysService){
		this.xmFaqcategorysService=xmFaqcategorysService;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle2("Faqcategorys", ptb, modelMap, this.moduleUtil);

		return "module/faqcategorys/index";
	}
	
	@RequestMapping(value = "/getFaqCategoryByParentid", method = RequestMethod.POST)
	@ResponseBody
	public String getFaqCategoryByParentid(@RequestParam("pid") int pid){
		List<XmFaqcategory> faqCategory=this.xmFaqcategorysService.getFaqCategoryByParentid(pid);
		return JSONArray.fromObject(faqCategory).toString();
	}
	
	@RequestMapping(value = "/getFaqCategory", method = RequestMethod.POST)
	@ResponseBody
	public String getTreeNode(){
		return this.xmFaqcategorysService.getFaqCategory();
	}

}

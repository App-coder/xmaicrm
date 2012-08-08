package com.crm.action.module;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.model.XmFaqcategory;
import com.crm.service.module.XmFaqcategorysService;

/**
 * 
 * 知识库分类
 * 
 * User: zhangjun
 * Date: 2012-8-28
 * Time: 下午20:00
 */
@Controller
@RequestMapping(value = "faqcategorys")
public class XmFaqcategorysController {
	
	XmFaqcategorysService xmFaqcategorysService;
	@Resource(name="xmFaqcategorysService")
	public void setXmFaqcategorysService(XmFaqcategorysService xmFaqcategorysService){
		this.xmFaqcategorysService=xmFaqcategorysService;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "afterser/faqcategorys";
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

package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ComboTree;
import com.crm.bean.easyui.TreeGrid1;
import com.crm.model.XmCatalog;
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
	public String getFaqCategoryByParentid(@RequestParam("pid") String pid){
		List<XmFaqcategory> faqCategory=this.xmFaqcategorysService.getFaqCategoryByParentid(pid);
		return JSONArray.fromObject(faqCategory).toString();
	}
	
	@RequestMapping(value = "/getFaqCategory", method = RequestMethod.POST)
	@ResponseBody
	public String getTreeNode(){
		return this.xmFaqcategorysService.getFaqCategory();
	}
	
	
	@RequestMapping(value = "/getCatalogAll", method = RequestMethod.GET)
	@ResponseBody
	public String getCatalogAll(){
		List<XmFaqcategory> catalogs = this.xmFaqcategorysService.getCatalogAll(); 
		List<TreeGrid1> tree = new ArrayList<TreeGrid1>();
		for(int i=0;i<catalogs.size();i++){
			if(catalogs.get(i).getFaqcategoryid().equals("H1")){
				TreeGrid1 root = new TreeGrid1();
				root.setId(catalogs.get(i).getFaqcategoryid());
				root.setText(catalogs.get(i).getFaqcategoryname());
				root.setAttributes(catalogs.get(i));
				
				root.setChildren(getCataLogs("H1", catalogs));
				root.setState("open");
				
				tree.add(root);
				
				break;
			}
		}
		return JSON.toJSONString(tree);
	}
	
	public List<TreeGrid1> getCataLogs(String parentid,List<XmFaqcategory> catalogs){
		List<TreeGrid1> childrens = new ArrayList<TreeGrid1>();
		for(int i=0;i<catalogs.size();i++){
			if(catalogs.get(i).getParentfaqcategoryid().equals(parentid)){
				TreeGrid1 tg = new TreeGrid1();
				tg.setId(catalogs.get(i).getFaqcategoryid());
				tg.setText(catalogs.get(i).getFaqcategoryname());
				tg.setAttributes(catalogs.get(i));
				tg.setChildren(getChildren(catalogs.get(i).getFaqcategoryid(), catalogs));
				childrens.add(tg);
			}
		}
		return childrens;
	}
	
	//目录，添加
	public List<ComboTree> getChildren(String parentid,List<XmFaqcategory> catalogs){
		List<ComboTree> childrens = new ArrayList<ComboTree>();
		for(int i=0;i<catalogs.size();i++){
			if(catalogs.get(i).getParentfaqcategoryid().equals(parentid)){
				ComboTree cbo = new ComboTree();
				cbo.setId(catalogs.get(i).getFaqcategoryid());
				cbo.setText(catalogs.get(i).getFaqcategoryname());
				cbo.setAttributes(catalogs.get(i));
				cbo.setChildren(getChildren(catalogs.get(i).getFaqcategoryid(), catalogs));
				childrens.add(cbo);
			}
		}
		return childrens;
	}

}

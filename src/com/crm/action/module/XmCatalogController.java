package com.crm.action.module;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.Tree;
import com.crm.model.XmCatalog;
import com.crm.service.module.XmCatalogService;
import com.crm.util.ActionUtil;

@Controller
@RequestMapping(value = "crm/module/catalogs")
public class XmCatalogController extends BaseController{
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmCatalogService xmCatalogService;
	@Resource(name="xmCatalogService")
	public void setXmCatalogService(XmCatalogService xmCatalogService) {
		this.xmCatalogService = xmCatalogService;
	}


	@RequestMapping(value = "/getCatalogById", method = RequestMethod.GET)
	@ResponseBody
	public String getCatalogById(String id){
		
		List<XmCatalog> catalog = this.xmCatalogService.getCatalogById(id);
		List<Tree> trees = new ArrayList<Tree>();
		for(XmCatalog c :catalog){
			Tree t = new Tree();
			t.setId(c.getCatalogid());
			t.setText(c.getCatalogname());
			if(c.getChildcount()>0){
				t.setState("closed");
			}
			trees.add(t);
		}
		return arrayToJson(trees);
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(int ptb,ModelMap modelMap){
		ActionUtil.setTitle2("Catalogs", ptb, modelMap, this.moduleUtil);
		return "module/catalogs/index";
	}
	
}

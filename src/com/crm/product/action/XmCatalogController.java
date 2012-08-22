package com.crm.product.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.bean.easyui.Tree;
import com.crm.model.XmCatalog;
import com.crm.product.service.XmCatalogService;

@Controller
@RequestMapping(value = "catalog")
public class XmCatalogController extends BaseController{
	
	XmCatalogService xmCatalogService;
	@Resource(name="xmCatalogService")
	public void setXmCatalogService(XmCatalogService xmCatalogService) {
		this.xmCatalogService = xmCatalogService;
	}


	@RequestMapping(value = "/getCatalogById", method = RequestMethod.GET)
	@ResponseBody
	public String getCatalogById(String parentid){
		
		List<XmCatalog> catalog = this.xmCatalogService.getCatalogById(parentid);
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
	public String index(){
		return "product/catalog";
	}
	
}

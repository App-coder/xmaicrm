package com.crm.product.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
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
	public String getCatalogById(String parentid){
		
		List<XmCatalog> catalog = this.xmCatalogService.getCatalogById(parentid);
		
		
		return "";
	}
	
}

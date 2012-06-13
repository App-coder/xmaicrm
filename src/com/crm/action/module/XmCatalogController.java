package com.crm.action.module;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ComboTree;
import com.crm.bean.easyui.Tree;
import com.crm.bean.easyui.TreeGrid1;
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
			t.setAttributes(c);
			if(c.getChildcount()>0){
				t.setState("closed");
			}
			trees.add(t);
		}
		return arrayToJson(trees);
	}
	
	@RequestMapping(value = "/getCatalogAll", method = RequestMethod.GET)
	@ResponseBody
	public String getCatalogAll(){
		List<XmCatalog> catalogs = this.xmCatalogService.getCatalogAll(); 
		List<TreeGrid1> tree = new ArrayList<TreeGrid1>();
		for(int i=0;i<catalogs.size();i++){
			if(catalogs.get(i).getCatalogid().equals("H1")){
				TreeGrid1 root = new TreeGrid1();
				root.setId(catalogs.get(i).getCatalogid());
				root.setText(catalogs.get(i).getCatalogname());
				root.setAttributes(catalogs.get(i));
				
				root.setChildren(getCataLogs("H1", catalogs));
				root.setState("open");
				
				tree.add(root);
				
				break;
			}
		}
	
		return JSON.toJSONString(tree);
	}
	
	public List<TreeGrid1> getCataLogs(String parentid,List<XmCatalog> catalogs){
		List<TreeGrid1> childrens = new ArrayList<TreeGrid1>();
		for(int i=0;i<catalogs.size();i++){
			if(catalogs.get(i).getParentcatalogid().equals(parentid)){
				TreeGrid1 tg = new TreeGrid1();
				tg.setId(catalogs.get(i).getCatalogid());
				tg.setText(catalogs.get(i).getCatalogname());
				tg.setAttributes(catalogs.get(i));
				tg.setChildren(getChildren(catalogs.get(i).getCatalogid(), catalogs));
				childrens.add(tg);
			}
		}
		return childrens;
	}
	
	@RequestMapping(value = "/getCatalogCbo", method = RequestMethod.GET)
	@ResponseBody
	public String getCatalogCbo(){
		List<XmCatalog> catalogs = this.xmCatalogService.getCatalogAll(); 
		return JSON.toJSONString(getChildren("H1", catalogs));
	}
	
	//目录，添加
	public List<ComboTree> getChildren(String parentid,List<XmCatalog> catalogs){
		List<ComboTree> childrens = new ArrayList<ComboTree>();
		for(int i=0;i<catalogs.size();i++){
			if(catalogs.get(i).getParentcatalogid().equals(parentid)){
				ComboTree cbo = new ComboTree();
				cbo.setId(catalogs.get(i).getCatalogid());
				cbo.setText(catalogs.get(i).getCatalogname());
				cbo.setAttributes(catalogs.get(i));
				cbo.setChildren(getChildren(catalogs.get(i).getCatalogid(), catalogs));
				childrens.add(cbo);
			}
		}
		return childrens;
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(int ptb,ModelMap modelMap){
		ActionUtil.setTitle2("Catalogs", ptb, modelMap, this.moduleUtil);
		return "module/catalogs/index";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(XmCatalog catalog){
		Message message = new Message();
		if(catalog.getCatalogid()!=null){
			this.xmCatalogService.insert(catalog);
		}else{
			this.xmCatalogService.edit(catalog);
		}
		message.setType(true);
		message.setMessage("产品分类编辑成功！");
		return JSON.toJSONString(message);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public String delete(String catalogid){
		Message message = new Message();
		
		this.xmCatalogService.delete(catalogid);
		
		message.setType(true);
		message.setMessage("产品分类删除成功！");
		return JSON.toJSONString(message);
	}
	
}

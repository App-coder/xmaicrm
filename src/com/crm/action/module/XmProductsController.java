package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CustomViewUtil;

/**
 * 产品控制器
 * 
 * User: zhujun
 * Date: 2012-8-22
 * Time: 上午11:23:14
 */
@Controller
@RequestMapping(value = "crm/module/products")
public class XmProductsController extends BaseController{
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle("Products", ptb, modelMap, this.moduleUtil);

		return "module/products/index";
	}
	
	@RequestMapping(value = "/viewpop")
	public String viewpop(ModelMap modelmap){
		
		modelmap.addAttribute("entitytype", "Products");
		
		XmTab tab = CustomViewUtil.getTabByName("Products");
		modelmap.addAttribute("tab", tab);
		
		moduleUtil.setViewProp(modelmap, "Products", tab);

		XmEntityname entityname = CustomViewUtil.getEntitynameByET("Products");
		modelmap.addAttribute("viewid", entityname.getEntityidfield());
		modelmap.addAttribute("entityname", entityname);
		
		return "module/products/viewpop";
	}
	
	@RequestMapping(value = "/showedit")
	public String showedit(int recordid,String module,int ptb,ModelMap modelmap){
		
		this.actionCls.showEdit(ptb, module, modelmap,recordid);
		
		return "module/products/edit";
	}
	
}

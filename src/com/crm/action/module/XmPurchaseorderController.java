package com.crm.action.module;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.model.XmPurchaseorder;
import com.crm.service.XmCustomViewService;
import com.crm.service.module.XmPurchaseorderService;
/**
 * 进货单控制器
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午10:49:40
 */
@Controller
@RequestMapping(value = "purchaseorder")
public class XmPurchaseorderController extends BaseController {
	
	XmPurchaseorderService xmPurchaseorderService;
	@Resource(name="xmPurchaseorderService")
	public void setXmPurchaseorderService(
			XmPurchaseorderService xmPurchaseorderService) {
		this.xmPurchaseorderService = xmPurchaseorderService;
	}

	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		//this.moduleUtil.setViewProp(modelMap,"Purchaseorder");
		return "purchase/purchaseorder";
	}
	
	/**
	 * 根据视图ID返回对应的JSON
	 * 
	 * @param page 页数
	 * @param rows 行数
	 * @param viewid 视图ID
	 * @return
	 */
	@RequestMapping(value = "/renderView", method = RequestMethod.POST)
	@ResponseBody
	public String renderView(int page,int rows,String entitytype,int viewid){
		
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(entitytype,viewid);
		
		int total = this.xmPurchaseorderService.getTotal(viewid);
		List<XmPurchaseorder> ls = this.xmPurchaseorderService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
}

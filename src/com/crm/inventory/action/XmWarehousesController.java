package com.crm.inventory.action;

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
import com.crm.inventory.service.XmWarehousesService;
import com.crm.model.XmCustomview;
import com.crm.model.XmPotential;
import com.crm.model.XmWarehouses;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 入库单控制器
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午10:06:49
 */
@Controller
@RequestMapping(value = "warehouses")
public class XmWarehousesController extends BaseController {
	
	XmWarehousesService xmWarehousesService;
	@Resource(name="xmWarehousesService")
	public void setXmWarehousesService(XmWarehousesService xmWarehousesService) {
		this.xmWarehousesService = xmWarehousesService;
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
	
	
	/**
	 * 入库单界面
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		this.moduleUtil.setViewProp(modelMap,"WarehousesService");
		
		return "inventory/warehouses";
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
		
		int total = this.xmWarehousesService.getTotal(viewid);
		List<XmWarehouses> ls = this.xmWarehousesService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
}

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
import com.crm.inventory.service.XmDeliverysService;
import com.crm.model.XmCustomview;
import com.crm.model.XmDeliverys;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 出库单控制器
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午10:37:34
 */
@Controller
@RequestMapping(value = "deliverys")
public class XmDeliverysController extends BaseController {
	
	XmDeliverysService xmDeliverysService;
	@Resource(name="xmDeliverysService")
	public void setXmDeliverysService(XmDeliverysService xmDeliverysService) {
		this.xmDeliverysService = xmDeliverysService;
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
		
		this.moduleUtil.setViewProp(modelMap,"Deliverys");
		
		return "inventory/deliverys";
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
		
		int total = this.xmDeliverysService.getTotal(viewid);
		List<XmDeliverys> ls = this.xmDeliverysService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
}

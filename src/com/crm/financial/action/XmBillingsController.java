package com.crm.financial.action;

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
import com.crm.financial.service.XmBillingsService;
import com.crm.model.XmBillings;
import com.crm.model.XmCustomview;
import com.crm.model.XmExpenses;
import com.crm.service.XmCustomViewService;

/**
 * 
 * 发票控制器
 * 
 * User: zhujun
 * Date: 2012-8-18
 * Time: 上午9:29:44
 */
@Controller
@RequestMapping(value = "billings")
public class XmBillingsController extends BaseController {

	XmBillingsService xmBillingsService;
	@Resource(name="xmBillingsService")
	public void setXmBillingsService(XmBillingsService xmBillingsService) {
		this.xmBillingsService = xmBillingsService;
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
		
		int total = this.xmBillingsService.getTotal(viewid);
		List<XmBillings> ls = this.xmBillingsService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
	
	
}

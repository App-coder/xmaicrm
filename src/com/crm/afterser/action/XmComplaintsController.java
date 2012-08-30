package com.crm.afterser.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.afterser.service.XmComplaintsService;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmComplaints;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 客户投诉
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午7:51:42
 */
@Controller
@RequestMapping(value = "complaints")
public class XmComplaintsController extends BaseController {
	
	XmComplaintsService xmComplaintsService;
	@Resource(name="xmComplaintsService")
	public void setXmComplaintsService(XmComplaintsService xmComplaintsService) {
		this.xmComplaintsService = xmComplaintsService;
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
		this.moduleUtil.setViewProp(modelMap,"Accountrecordss");
		return "afterser/complaints";
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
		
		int total = this.xmComplaintsService.getTotal(viewid);
		List<XmComplaints> ls = this.xmComplaintsService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
}

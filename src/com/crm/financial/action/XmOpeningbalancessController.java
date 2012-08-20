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
import com.crm.financial.service.XmOpeningbalancessService;
import com.crm.model.XmChargesrecords;
import com.crm.model.XmCustomview;
import com.crm.model.XmOpeningbalancess;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 期初余额
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午9:28:31
 */
@Controller
@RequestMapping(value = "openingbalancess")
public class XmOpeningbalancessController extends BaseController {
	
	XmOpeningbalancessService xmOpeningbalancessService;
	@Resource(name="xmOpeningbalancessService")
	public void setXmOpeningbalancessService(
			XmOpeningbalancessService xmOpeningbalancessService) {
		this.xmOpeningbalancessService = xmOpeningbalancessService;
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
		this.moduleUtil.setViewProp(modelMap,"Openingbalancess");
		return "financial/openingbalancess";
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
		
		int total = this.xmOpeningbalancessService.getTotal(viewid);
		List<XmOpeningbalancess> ls = this.xmOpeningbalancessService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
}

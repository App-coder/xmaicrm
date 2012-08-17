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
import com.crm.afterser.service.XmAccountrecordssService;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmAccountrecordss;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 客户服务
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午7:41:16
 */
@Controller
@RequestMapping(value = "accountrecordss")
public class XmAccountrecordssController extends BaseController {
	
	XmAccountrecordssService xmAccountrecordssService;
	@Resource(name="xmAccountrecordssService")
	public void setXmAccountrecordssService(
			XmAccountrecordssService xmAccountrecordssService) {
		this.xmAccountrecordssService = xmAccountrecordssService;
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
		return "afterser/accountrecordss";
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
		
		int total = this.xmAccountrecordssService.getTotal(viewid);
		List<XmAccountrecordss> ls = this.xmAccountrecordssService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
}

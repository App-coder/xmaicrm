package com.crm.potentials.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.model.XmField;
import com.crm.model.XmPotential;
import com.crm.potentials.service.XmPotentialService;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvadvfilterService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.service.XmCvstdfilterService;
import com.crm.service.XmFieldService;

@Controller
@RequestMapping(value = "potential")
public class XmPotentialController extends BaseController {
	
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	XmCvcolumnlistService xmCvcolumnlistService;
	@Resource(name="xmCvcolumnlistService")
	public void setXmCvcolumnlistService(XmCvcolumnlistService xmCvcolumnlistService) {
		this.xmCvcolumnlistService = xmCvcolumnlistService;
	}
	
	XmPotentialService xmPotentialService;
	@Resource(name="xmPotentialService")
	public void setXmPotentialService(XmPotentialService xmPotentialService) {
		this.xmPotentialService = xmPotentialService;
	}
	
	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		//得到默认的view
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey("Potentials",-1);
		List<Column> cols = this.xmCvcolumnlistService.getViewColumn(customview);
		modelMap.addAttribute("dview",arrayToJson(cols));
		modelMap.addAttribute("customview",customview);
		
		List<XmCustomview> views = this.xmCustomViewService.queryByEntityType("Potentials");
		modelMap.addAttribute("views",views);
		
		List<XmField> repfields = this.xmFieldService.getReportField("Potentials");
		modelMap.addAttribute("repfields",repfields);
		
		return "potential/index";
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
		
		int total = this.xmPotentialService.getTotal(viewid);
		List<XmPotential> ls = this.xmPotentialService.loadList(page,rows,viewid);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
		return objToJson(list);
	}
	
}

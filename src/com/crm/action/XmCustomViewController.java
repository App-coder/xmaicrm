package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.easyui.Column;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvcolumnlist;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.util.JsonUtil;

@Controller
@RequestMapping(value = "customview")
public class XmCustomViewController extends BaseController {
	
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
    

	@RequestMapping(value = "/queryByEntityType", method = RequestMethod.GET)
	public String getViewList(@RequestParam("entitytype") String entitytype){
		List<XmCustomview> list=this.xmCustomViewService.queryByEntityType(entitytype);
		return this.arrayToJson(list);
	}
	

	/**
	 * 
	 * 取得COLUMN的JSON字符串
	 * @param entitytype 实体类型
	 * @param viewid 视图ID
	 * @return 
	 */
	@RequestMapping(value = "/getViewColumn", method = RequestMethod.GET)
	@ResponseBody
	public String getViewColumn(String entitytype,int viewid){
		
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(entitytype,viewid);
		List<Column> cols = this.xmCvcolumnlistService.getViewColumn(customview);
		
		return arrayToJson(cols);
	}

	
}

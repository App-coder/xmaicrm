package com.crm.action.settings.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmPicklist;
import com.crm.service.XmPicklistService;


/**
 * 
 * 系统设置-下拉框设置
 * 
 * User: zhangjun
 * Date: 2012-11-1
 * Time: 上午10:40:08
 */
@Controller
@RequestMapping(value = "crm/settings/picklist")
public class XmPicklistController extends BaseController {
	@Autowired
	XmPicklistService xmPicklistService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/picklist";
	}
	
	@RequestMapping(value="/getPickListName",method=RequestMethod.POST)
	@ResponseBody
	public String getPickListName(ModelMap modelMap,int tabid,int page,int rows){
		List<Object> list=this.xmPicklistService.getPickListName(tabid,page, rows);
		int total=this.xmPicklistService.getTotal(tabid);
		ListBean ls = new ListBean();
		ls.setTotal(total);
		ls.setRows(list);
		return JSON.toJSONString(ls);		
	}
	
	@RequestMapping(value="/getPickListValue",method=RequestMethod.GET)
	@ResponseBody
	public String getPickListValue(ModelMap modelMap,String colname){
		List<XmPicklist> list=this.xmPicklistService.getPickListValue(colname);
		return JSON.toJSONString(list);		
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	@ResponseBody
	public String submit(ModelMap modelMap,String colname,String arrpick){
		int affectrows=this.xmPicklistService.updatePickListValue(colname, arrpick);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}
		return objToJson(msg);
	}
	
	
	
	
	
	
}

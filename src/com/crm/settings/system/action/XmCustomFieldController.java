package com.crm.settings.system.action;

import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

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
import com.crm.model.XmField;
import com.crm.service.XmPicklistService;
import com.crm.settings.system.service.XmCustomFieldService;
import com.crm.util.JsonUtil;


/**
 * 系统设置-自定义字段
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:36:23
 */
@Controller
@RequestMapping(value = "settings/customfield")
public class XmCustomFieldController extends BaseController {
	
	@Autowired
	XmCustomFieldService xmCustomFieldService;
	@Autowired
	XmPicklistService xmPicklistService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/customfield";
	}
	
	
	@RequestMapping(value="/getFieldsByTabid",method=RequestMethod.POST)
	@ResponseBody
	public String getFieldsByTabid(ModelMap modelMap,int tabid,int page,int rows){
		List<XmField> list=this.xmCustomFieldService.getFieldsByTabid(tabid, page, rows);
		int total=this.xmCustomFieldService.getTotal(tabid);
		ListBean ls = new ListBean();
		ls.setTotal(total);
		ls.setRows(list);
		return JSON.toJSONString(ls);
	}
	
	@RequestMapping(value="/getPickListByColname",method=RequestMethod.GET)
	@ResponseBody
	public String getFieldsByTabid(ModelMap modelMap,String colname){
		List<Object> list=this.xmPicklistService.getPickList(colname);
		return JSON.toJSONString(list);
	}
	
	
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	@ResponseBody
	public String execute(ModelMap modelMap,String action,String queryParams){
		int affectrows  = 0;
		if(action.equals("add"))
			affectrows=this.xmCustomFieldService.insertCustomField(queryParams);
		else if(action.equals("update"))
			affectrows=this.xmCustomFieldService.updateByPrimaryKeySelective(queryParams);
		else 
			affectrows=this.xmCustomFieldService.deleteCustomField(queryParams);
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}else{
			msg.setMessage("编辑时发生异常！");
			msg.setType(false);
		}
		return objToJson(msg);
	}
	
	
	
	

}

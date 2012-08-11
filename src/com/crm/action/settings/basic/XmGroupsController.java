package com.crm.action.settings.basic;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.Combobox;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmGroups;
import com.crm.service.settings.basic.XmGroupsService;

/**
 * 
 * 基本设置-部门机构
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:14:10
 */
@Controller
@RequestMapping(value = "crm/settings/group")
public class XmGroupsController extends BaseController {
	
	XmGroupsService xmGroupsService;
	@Resource(name="xmGroupsService")
	public void setXmGroupsService(XmGroupsService xmGroupsService) {
		this.xmGroupsService = xmGroupsService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/basic/group";
	}

	@RequestMapping(value = "/listAll", method = RequestMethod.POST)
	@ResponseBody
	public String listAll(){
		List<XmGroups> groups = this.xmGroupsService.loadAll();
		ListBean bean = new ListBean();
		bean.setRows(groups);
		bean.setTotal(groups.size());
		return JSON.toJSONString(bean);
	}
	
	@RequestMapping(value = "/getCombox", method = RequestMethod.POST)
	@ResponseBody
	public String getCombox(){
		List<XmGroups> groups = this.xmGroupsService.loadAll();
		List<Combobox> boxs = new ArrayList<Combobox>();
		for(int i=0;i<groups.size();i++){
			Combobox cbo = new Combobox();
			cbo.setId(groups.get(i).getGroupid()+"");
			cbo.setText(groups.get(i).getGroupname());
			boxs.add(cbo);
		}
		return JSON.toJSONString(boxs);
	}
	
	@RequestMapping(value = "/getGroupById", method = RequestMethod.POST)
	@ResponseBody
	public String getGroupById(int groupid){
		XmGroups group = this.xmGroupsService.getGroupById(groupid);
		return JSON.toJSONString(group);
	}
	
	@RequestMapping(value = "/groupEdit", method = RequestMethod.POST)
	@ResponseBody
	public String groupEdit(XmGroups groups,String action){
		Message msg = new Message();
		if(action.equals("add")){
			this.xmGroupsService.add(groups);
		}else{
			this.xmGroupsService.update(groups);
		}
		msg.setType(true);
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(int groupid){
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("部门删除成功！");
		this.xmGroupsService.deleteById(groupid);
		return JSON.toJSONString(msg);
	}
	
}

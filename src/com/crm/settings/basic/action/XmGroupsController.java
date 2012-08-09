package com.crm.settings.basic.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmGroups;
import com.crm.settings.basic.service.XmGroupsService;

import java.util.*;

import javax.annotation.Resource;

/**
 * 
 * 基本设置-部门机构
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:14:10
 */
@Controller
@RequestMapping(value = "settings/group")
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
	
	
}

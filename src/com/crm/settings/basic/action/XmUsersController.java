package com.crm.settings.basic.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmUsers;
import com.crm.settings.basic.service.XmUsersService;
import com.crm.util.JsonUtil;

import java.util.*;

import javax.annotation.Resource;

/**
 * 
 * 基本设置-系统用户
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:09:13
 */
@Controller
@RequestMapping(value = "settings/users")
public class XmUsersController extends BaseController {
	
	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/basic/users";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows){
		
		List<Object> users = this.xmUsersService.getSysUser(page,rows);
		int total = this.xmUsersService.getTotal();

		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(users);
		
		return JSON.toJSONString(bean);
	}
	
	
}

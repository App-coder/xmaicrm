package com.crm.action.portlets;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmUsers;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.service.system.UserService;
import java.util.*;

/**
 * 
 * 在线用户统计
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 下午8:34:53
 */
@Controller
@RequestMapping(value = "crm/portlets/online_users")
public class OnlineusersController {

	private XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		//设置状态，将不在用户状态取消
		this.xmUsersService.setUsersUnvalid();
		
		List<XmUsers> onlineusers = this.xmUsersService.getOnlineusers();
		ListBean bean = new ListBean();
		bean.setRows(onlineusers);
		bean.setTotal(onlineusers.size());
		
		return JSON.toJSONString(bean);
	}
	
}

package com.crm.settings.basic.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmUser2role;
import com.crm.model.XmUsers;
import com.crm.model.XmUsers2group;
import com.crm.settings.basic.service.XmUser2roleService;
import com.crm.settings.basic.service.XmUsers2groupService;
import com.crm.settings.basic.service.XmUsersService;
import com.crm.util.HtmlUtil;

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
	
	XmUser2roleService xmUser2roleService;
	@Resource(name="xmUser2roleService")
	public void setXmUser2roleService(XmUser2roleService xmUser2roleService) {
		this.xmUser2roleService = xmUser2roleService;
	}
	
	XmUsers2groupService xmUsers2groupService;
	@Resource(name="xmUsers2groupService")
	public void setXmUsers2groupService(XmUsers2groupService xmUsers2groupService) {
		this.xmUsers2groupService = xmUsers2groupService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		modelMap.addAttribute("userstatus",HtmlUtil.getUserStatus());
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
	
	@RequestMapping(value = "/getUserById", method = RequestMethod.POST)
	@ResponseBody
	public String getUserById(@RequestParam("id") int id){
		Object user = this.xmUsersService.getUserById(id);
		return JSON.toJSONString(user);
	}
	
	@RequestMapping(value = "/userEdit", method = RequestMethod.POST)
	@ResponseBody
	public String userEdit(XmUsers user,String roleid,int groupid,String action){
		Message msg = new Message();
		
		//添加
		if(action.equals("add")){
			int keyid = this.xmUsersService.add(user);
			XmUser2role user2role = new XmUser2role();
			user2role.setRoleid(roleid);
			user2role.setUserid(keyid);
			this.xmUser2roleService.add(user2role);
			XmUsers2group user2group = new XmUsers2group();
			user2group.setGroupid(groupid);
			user2group.setUserid(keyid);
			this.xmUsers2groupService.add(user2group);
			
			msg.setMessage("用户添加成功！");
			
		}else{
			this.xmUsersService.update(user);
			XmUser2role user2role = new XmUser2role();
			user2role.setRoleid(roleid);
			user2role.setUserid(user.getId());
			this.xmUser2roleService.update(user2role);
			XmUsers2group user2group = new XmUsers2group();
			user2group.setGroupid(groupid);
			user2group.setUserid(user.getId());
			this.xmUsers2groupService.update(user2group);
			
			msg.setMessage("用户编辑成功！");
		}
		
		msg.setType(true);
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(int id){
		int affectrow = this.xmUsersService.setDeleteStatus(id,1);
		Message msg = new Message();
		if(affectrow == 1){
			msg.setType(true);
			msg.setMessage("用户删除成功！");
		}else{
			msg.setType(false);
			msg.setMessage("用户删除失败！");
		}
		return JSON.toJSONString(msg);
	}
	
}

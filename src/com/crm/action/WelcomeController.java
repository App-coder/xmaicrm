package com.crm.action;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.bean.crm.UserPermission;
import com.crm.model.XmUsers;
import com.crm.service.XmHomestuffService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.service.system.CacheDataService;
import com.crm.service.system.UserService;
import com.crm.util.Constant;

@Controller
@RequestMapping(value = "crm/welcome")
public class WelcomeController implements ServletContextAware {

	private ServletContext servletContext;
	public void setServletContext(ServletContext servletContext) { // 实现接口中的setServletContext方法
		this.servletContext = servletContext;
	}

	XmUsersService xmUsersService;
	@Resource(name = "xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}

	CacheDataService cacheDataService;
	@Resource(name = "cacheDataService")
	public void setCacheDataService(CacheDataService cacheDataService) {
		this.cacheDataService = cacheDataService;
	}

	UserService userService;
	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	XmHomestuffService xmHomestuffService;
	@Resource(name="xmHomestuffService")
	public void setXmHomestuffService(XmHomestuffService xmHomestuffService) {
		this.xmHomestuffService = xmHomestuffService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "welcome";
	}

	@RequestMapping(value = "/console", method = RequestMethod.GET)
	public String console() {
		return "console";
	}

	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String homepage() {
		return "homepage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(XmUsers user, ModelMap modelmap, HttpSession session) {
		Message msg = new Message();
		XmUsers login = this.xmUsersService.validateUser(user);
		if (login != null) {
			// 初始化系统缓存
			this.cacheDataService.initData();
			//用户的权限得到
			UserPermission userpermission = this.userService.getUserPermission(login);
			userpermission.setUser(login);
			session.setAttribute(Constant.USERPERMISSION, userpermission);
			// 缓存导航栏
			session.setAttribute("navbar", this.userService.getNavBar(login,this.servletContext.getRealPath("WEB-INF/tpl"),userpermission));
			
			msg.setType(true);
			msg.setMessage("用户验证成功！");
			return JSON.toJSONString(msg);
		} else {
			msg.setType(false);
			msg.setMessage("用户验证没有通过！");
			return JSON.toJSONString(msg);
		}
	}
	
	@RequestMapping(value = "/loginout", method = RequestMethod.GET)
	public String loginout(HttpSession session){
		session.removeAttribute(Constant.USERPERMISSION);
		return "welcome";
	}

	@RequestMapping(value = "/navbar", method = RequestMethod.POST)
	public String navbar(String pathname, String url, ModelMap modelmap) {
		modelmap.addAttribute("pathname", pathname);
		modelmap.addAttribute("url", url);
		return "navbar";
	}

}

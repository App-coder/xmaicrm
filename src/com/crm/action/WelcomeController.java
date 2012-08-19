package com.crm.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.model.XmUsers;
import com.crm.settings.basic.service.XmUsersService;
import com.crm.util.Constant;

@Controller
@RequestMapping(value = "crm/welcome")
public class WelcomeController {
	
	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "welcome";
	}
	
	@RequestMapping(value = "/console", method = RequestMethod.GET)
	public String console(){
		return "console";
	}
	
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String homepage(){
		return "homepage";
	}
	
	@RequestMapping(value = "/desktop", method = RequestMethod.GET)
	public String desktop(){
		return "desktop";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(XmUsers user,ModelMap modelmap,HttpSession session){
		XmUsers exist = this.xmUsersService.validateUser(user);
		if(exist!=null){
			session.setAttribute(Constant.USER, exist);
			return "redirect:/crm/welcome/desktop";
		}else{
			modelmap.addAttribute("message","用户验证没有通过！");
			return "welcome";
		}
	}
	
	@RequestMapping(value = "/navbar", method = RequestMethod.POST)
	public String navbar(String pathname,String url,ModelMap modelmap){
		modelmap.addAttribute("pathname",pathname);
		modelmap.addAttribute("url",url);
		return "navbar";
	}
	
}

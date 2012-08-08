package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.bean.crm.UserPermission;
import com.crm.model.XmHomestuff;
import com.crm.service.XmHomestuffService;
import com.crm.util.Constant;
import com.crm.util.crm.CustomViewUtil;

/**
 * 
 * 工作台
 * 
 * User: zhujun
 * Date: 2012-8-8
 * Time: 下午8:26:28
 */
@Controller
@RequestMapping(value = "crm/module/home")
public class XmHomeController {
	
	XmHomestuffService xmHomestuffService;
	@Resource(name="xmHomestuffService")
	public void setXmHomestuffService(XmHomestuffService xmHomestuffService) {
		this.xmHomestuffService = xmHomestuffService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelmap,HttpSession session,HttpServletRequest request) throws UnsupportedEncodingException{
		
		//不带ptb参数情况下，进入默认的desktop
		String ptb = request.getParameter("ptb");
		if(ptb!=null){
			modelmap.addAttribute("tab",CustomViewUtil.getTabByName("Home"));
			modelmap.addAttribute("ptb",new String(ptb.getBytes("ISO-8859-1"),
					"utf-8"));
		}
		
		UserPermission userpermission = (UserPermission)session.getAttribute(Constant.USERPERMISSION);
		List<XmHomestuff> stuffs = this.xmHomestuffService.getStuffByRole(userpermission.getRole().getRoleid());
		modelmap.addAttribute("stuffs",stuffs);
		return "desktop";
	}
	
}

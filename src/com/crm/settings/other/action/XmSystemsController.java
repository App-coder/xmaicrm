package com.crm.settings.other.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.model.XmSystems;
import com.crm.settings.other.service.XmSystemsService;

/**
 * User: zhujun
 * Date: 2012-8-12
 * Time: 下午9:07:01
 * 
 * 其他设置-SMTP服务器 
 * 
 */
@Controller
@RequestMapping(value = "settings/system")
public class XmSystemsController {
	
	XmSystemsService xmSystemsService;
	@Resource(name="xmSystemsService")
	public void setXmSystemsService(XmSystemsService xmSystemsService) {
		this.xmSystemsService = xmSystemsService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmSystems> systems = this.xmSystemsService.getSystemsByType("email");
		modelMap.addAttribute("smtp",systems.get(0));
		
		return "settings/other/system";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(XmSystems system){
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("服务器编辑成功！");
		if(system.getSmtpAuth() == "" || system.getSmtpAuth()== null){
			system.setSmtpAuth("false");
		}
		this.xmSystemsService.update(system);
		return JSON.toJSONString(msg);
	}
	

}

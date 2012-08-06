package com.crm.action.settings.other;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.model.XmMessageaccount;
import com.crm.service.settings.other.XmMessageaccountService;
import com.crm.util.Constant;

/**
 * 
 * 短信通道
 * 
 * User: zhujun
 * Date: 2012-8-6
 * Time: 下午4:33:34
 */
@Controller
@RequestMapping(value = "crm/settings/messageaccount")
public class XmMessageaccountController {

	XmMessageaccountService xmMessageaccountService;
	@Resource(name="xmMessageaccountService")
	public void setXmMessageaccountService(
			XmMessageaccountService xmMessageaccountService) {
		this.xmMessageaccountService = xmMessageaccountService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		XmMessageaccount msgaccount = this.xmMessageaccountService.getMessageAccount();
		modelMap.addAttribute("msgaccount",msgaccount);
		
		return "settings/other/messageaccount";
	}
	
}

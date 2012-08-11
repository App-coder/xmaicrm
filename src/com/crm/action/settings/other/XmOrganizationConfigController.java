package com.crm.action.settings.other;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.model.XmOrganizationdetails;
import com.crm.service.settings.other.XmOrganizationdetailsService;
/**
 * 
 * 其他设置-公司信息
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/organizationconfig")
public class XmOrganizationConfigController extends BaseController {

	XmOrganizationdetailsService xmOrganizationdetailsService;
	@Resource(name="xmOrganizationdetailsService")
	public void setXmOrganizationdetailsService(
			XmOrganizationdetailsService xmOrganizationdetailsService) {
		this.xmOrganizationdetailsService = xmOrganizationdetailsService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		XmOrganizationdetails details = this.xmOrganizationdetailsService.getDetails();
		modelMap.addAttribute("details",details);
		
		return "settings/other/organizationconfig";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(XmOrganizationdetails details){
		this.xmOrganizationdetailsService.update(details);
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("公司信息编辑成功！");
		return JSON.toJSONString(msg);
	}
	
	
}

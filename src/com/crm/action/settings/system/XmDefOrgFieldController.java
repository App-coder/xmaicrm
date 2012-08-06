package com.crm.action.settings.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.model.XmField;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;
import com.crm.service.XmTabService;

/**
 * 
 * 系统设置-全局字段
 * 
 * User: zhujun
 * Date: 2012-8-5
 * Time: 下午10:17:37
 */
@Controller
@RequestMapping(value = "crm/settings/deforgfield")
public class XmDefOrgFieldController {

	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		modelMap.addAttribute("modules",this.xmTabService.getDefOrgFieldModule());
		
		return "settings/system/deforgfield";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int tabid){
		List<Object> fields = this.xmFieldService.getDefOrgFields(tabid);
		return JSON.toJSONString(fields);
	}
	
}

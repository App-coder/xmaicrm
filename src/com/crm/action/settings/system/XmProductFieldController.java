package com.crm.action.settings.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;
import com.crm.service.XmTabService;
import com.crm.service.settings.system.XmProductFieldService;
/**
 * 
 * 系统设置-产品字段定制
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/productfield")
public class XmProductFieldController extends BaseController {
	@Autowired
	XmTabService xmTabService;
	@Autowired
	XmFieldService xmFieldService;
	@Autowired
	XmProductFieldService xmProductFieldService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		List<XmTab> modules = this.xmTabService.getProductFieldModule();
		modelMap.addAttribute("modules",modules);
		return "settings/system/productfield";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(String module){
		List<Object> fields = this.xmFieldService.getProductField(module);
		return JSON.toJSONString(fields);
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	@ResponseBody
	public String submit(String module,String xmproduct){
		int affectrows=this.xmProductFieldService.submit(module, xmproduct);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}else{
			msg.setMessage("编辑时发生异常！");
			msg.setType(false);
		}
		return objToJson(msg);
	}

}

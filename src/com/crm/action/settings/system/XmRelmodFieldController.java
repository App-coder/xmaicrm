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
import com.crm.service.settings.system.XmRelmodFieldService;

@Controller
@RequestMapping(value = "crm/settings/relmodfield")
public class XmRelmodFieldController extends BaseController {
	@Autowired
	XmTabService xmTabService;
	@Autowired
	XmFieldService xmFieldService;
	@Autowired
	XmRelmodFieldService xmRelmodFieldService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		List<XmTab> modules = this.xmTabService.getRelmodField();
		modelMap.addAttribute("modules",modules);
		return "settings/system/relmodfield";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(String module,int tabid){
		List<Object> fields = this.xmFieldService.getRelmodField(module, tabid);
		return JSON.toJSONString(fields);
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	@ResponseBody
	public String submit(String module,String xmrelmod){
		int affectrows=this.xmRelmodFieldService.submit(module, xmrelmod);
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

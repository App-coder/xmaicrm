package com.crm.action.settings.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
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
public class XmDefOrgFieldController extends BaseController {

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
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	@ResponseBody
	public String submit(int tabid,String ck_fieldid,String unck_fieldid){
		int affectrows=this.xmFieldService.submit(tabid, ck_fieldid, unck_fieldid);
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

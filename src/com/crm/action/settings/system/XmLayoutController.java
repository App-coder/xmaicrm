package com.crm.action.settings.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.model.XmField;
import com.crm.service.XmFieldService;

/**
 * 
 * 系统定制-页面布局
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:44:46
 */
@Controller
@RequestMapping(value = "crm/settings/layoutlist")
public class XmLayoutController extends BaseController {
	
	@Autowired
	XmFieldService xmFieldService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/layoutlist";
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/getLayoutField", method = RequestMethod.GET)
	@ResponseBody
	public String getLayoutField(int tabid,String blockids){
		String[] arr=blockids.split(",");
		Map map=new HashMap<String, List>();
		for(String a:arr){
			map.put(a, this.xmFieldService.getLayoutField(tabid,Integer.parseInt(a)));
		}
		return JSON.toJSONString(map);
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	@ResponseBody
	public String execute(ModelMap modelMap,XmField xmField){
		int affectrows  = 0;
	    affectrows=this.xmFieldService.updateByPrimaryKeySelective(xmField);
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

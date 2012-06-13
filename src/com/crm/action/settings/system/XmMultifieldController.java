package com.crm.action.settings.system;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmMultifield;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;
import com.crm.service.XmTabService;
import com.crm.service.settings.system.XmMultifieldService;

/**
 * 控制面板 > 级联字段
 * 
 * User: zhujun
 * Date: 2012-8-21
 * Time: 下午10:29:09
 */
@Controller
@RequestMapping(value = "crm/settings/multifield")
public class XmMultifieldController {
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	@Autowired
	XmFieldService xmFieldService;
	
	XmMultifieldService xmMultifieldService;
	@Resource(name="xmMultifieldService")
	public void setXmMultifieldService(XmMultifieldService xmMultifieldService) {
		this.xmMultifieldService = xmMultifieldService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmTab> modules = this.xmTabService.getModulesOfCustomMultiField();
		modelMap.addAttribute("modules",modules);
		
		return "settings/system/multifield";
	}
	

	/**
	 * 取得模块级联字段
	 * 
	 * @param tabid 
	 * @return
	 */
	@RequestMapping(value = "/getCustomMultiField", method = RequestMethod.POST)
	@ResponseBody
	public String getCustomMultiField(int tabid){
		ListBean bean = new ListBean();
		List<XmMultifield> multifields = this.xmMultifieldService.getMultifield(tabid);
		bean.setRows(multifields);
		bean.setTotal(multifields.size());
		return JSON.toJSONString(bean);
	}
	
	@RequestMapping(value = "/getMultiLevel1", method = RequestMethod.GET)
	@ResponseBody
	public String getMultiLevel1(int multifieldid){
		List<Object> multiLevel1=this.xmMultifieldService.getMultiLevel1(multifieldid);
		return JSON.toJSONString(multiLevel1);
	}
	
	@RequestMapping(value = "/getMultiLevel2", method = RequestMethod.POST)
	@ResponseBody
	public String getMultiLevel2(int tabid,String typeofdata){
		List<Object> multiLevel2=this.xmFieldService.getMultiLevel2(tabid, typeofdata);
		return JSON.toJSONString(multiLevel2);
	}
	
	@RequestMapping(value = "/getMultiLevelField", method = RequestMethod.GET)
	@ResponseBody
	public String getMultiLevelField(int thelevel,int parentfieldid,String tablename){
		List<Object> multiLevelField=this.xmMultifieldService.getMultiLevelField(thelevel, parentfieldid, tablename);
		return JSON.toJSONString(multiLevelField);
	}
	
	
	
	
	
	
	
}

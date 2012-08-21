package com.crm.action;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.ui.ModelMap;

/**
 * 基本的CONTROLLER
 * User: zhujun
 * Date: 2012-8-13
 * Time: 下午3:30:12
 */
public class BaseController {
	
	public String getTitle(String name,String title){
		if(title!=null){
			return name+"-"+title;
		}else{
			return name;
		}
	}
	
	public String objToJson(Object o,JsonConfig cfg){
		return JSONObject.fromObject(o,cfg).toString();
	}
	
	public String objToJson(Object o){
		return JSONObject.fromObject(o).toString();
	}
	
	public String arrayToJson(Object o,JsonConfig cfg){
		return JSONArray.fromObject(o,cfg).toString();
	}
	
	public String arrayToJson(Object o){
		return JSONArray.fromObject(o).toString();
	}
	
	public void setBar(String[] barArray,ModelMap modelmap){
		HashMap barmap = new HashMap();
		for(int i=0;i<barArray.length;i++){
			barmap.put(barArray[i], barArray[i]);
		}
		modelmap.addAttribute("barmap",barmap);
	}
	
}

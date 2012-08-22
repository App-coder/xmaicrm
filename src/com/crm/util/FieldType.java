package com.crm.util;

import java.util.HashMap;
import java.util.Map;
public class FieldType{
	private static  Map<String, String> map=new HashMap<String,String>();
	private static  Map<String, String> mapdrop=new HashMap<String,String>();
	private static String TEXTFIELD="文本";
//	private static String TALKTOOL="数字";
	private static String COMBOBOX="下拉框 ";
	private static String TALKTOOL="贸易通";
	
	
	
	static{
		map.put("1", TEXTFIELD);
		map.put("15", COMBOBOX);
		map.put("88", TALKTOOL);
		
//		mapdrop.put("1", "");
	}
	
	
	
	public static String getUiType(String key){
		return map.get(key);
	}

}

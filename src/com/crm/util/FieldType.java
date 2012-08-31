package com.crm.util;

import java.util.HashMap;
import java.util.Map;
public class FieldType{
	private static  Map<String, String> map=new HashMap<String,String>();
	private static  Map<String, String> mapdrop=new HashMap<String,String>();
	private static String TEXTFIELD="文本";
	private static String NUMBER="数字";
	private static String PERCENT="百分比";
	private static String CURRENCY="货币";
	private static String DATE="日期";
	private static String EMAIL="Email";
	private static String PHONE="电话";
	private static String PICKLIST="下拉框";
	private static String URL="网址";
	private static String CHECKBOX="复选框";
	private static String TEXTAREA="文本域";
	private static String MULTISELECTCOMBO="多选框";
	private static String QQ="QQ";
	private static String MSN="Msn";
	private static String TRADE="贸易通";
	private static String YAHOO="Yahoo";
	private static String SKYPE="Skype";
	
	
	static{
		map.put("1", TEXTFIELD);
		map.put("7", NUMBER);
		map.put("9", PERCENT);
		map.put("71", CURRENCY);
		map.put("5", DATE);
		map.put("13", EMAIL);
		map.put("11", PHONE);
		map.put("15", PICKLIST);
		map.put("17", URL);
		map.put("56", CHECKBOX);
		map.put("21", TEXTAREA);
		map.put("33", MULTISELECTCOMBO);
		map.put("86", QQ);
		map.put("87", MSN);
		map.put("88", TRADE);
		map.put("89", YAHOO);
		map.put("85", SKYPE);
	}
	
	
	
	public static String getUiType(String key){
		return map.get(key);
	}

}

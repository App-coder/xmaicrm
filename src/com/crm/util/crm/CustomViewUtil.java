package com.crm.util.crm;

import java.util.HashMap;

import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;

public class CustomViewUtil {
	
	
	public static XmEntityname getEntitynameByET(String entitytype){
		HashMap<String,XmEntityname>  hmen = (HashMap<String,XmEntityname> )CacheUtil.getFromCache(Constant.ENTITYNAME);
		return hmen.get(entitytype.toLowerCase());
	}
	
	public static XmTab getTabByName(String entitytype) {
		HashMap<String,XmTab>  hmen = (HashMap<String,XmTab> )CacheUtil.getFromCache(Constant.TAB);
		return hmen.get(entitytype.toLowerCase());
	}
	
	public static XmTab getTabByLab(String lab){
		HashMap<String,XmTab>  hmen = (HashMap<String,XmTab> )CacheUtil.getFromCache(Constant.TABBYLAB);
		return hmen.get(lab.toLowerCase());
	}

	public static XmEntityname getEntitynameByEID(String eid) {
		HashMap<String,XmEntityname>  hmen = (HashMap<String,XmEntityname> )CacheUtil.getFromCache(Constant.TABBYEID);
		return hmen.get(eid);
	}

	public static String getColumnVal(String type,String value) {
		type = getType(type);
		if(type=="Date" || type=="Varchar"){
			return "'"+value+"'";
		}else{
			return value;
		}
	}
	
	public static String getType(String type){
		String typestr = "";
		if(type.indexOf("C")!=-1){
			typestr = "Boolean";
		}else if(type.indexOf("D")!=-1){
			typestr = "Date";
		}else if(type.indexOf("DT")!=-1){
			typestr = "DateTime";
		}else if(type.indexOf("E")!=-1){
			typestr = "EMail";
		}else if(type.indexOf("I")!=-1){
			typestr = "Integer";
		}else if(type.indexOf("N")!=-1){
			typestr = "Number";
		}else if(type.indexOf("V")!=-1){
			typestr = "Varchar";
		}
		return typestr;
	}
	
}

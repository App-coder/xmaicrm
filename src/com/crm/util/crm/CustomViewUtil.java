package com.crm.util.crm;

import java.util.HashMap;

import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.util.CacheManager;
import com.crm.util.Constant;

public class CustomViewUtil {
	
	
	public static XmEntityname getEntitynameByET(String entitytype){
		HashMap<String,XmEntityname>  hmen = (HashMap<String,XmEntityname> )CacheManager.getFromCache(Constant.ENTITYNAME);
		return hmen.get(entitytype);
	}
	
	public static XmTab getTabByName(String entitytype) {
		HashMap<String,XmTab>  hmen = (HashMap<String,XmTab> )CacheManager.getFromCache(Constant.TAB);
		return hmen.get(entitytype);
	}
	
	public static XmTab getTabByLab(String lab){
		HashMap<String,XmTab>  hmen = (HashMap<String,XmTab> )CacheManager.getFromCache(Constant.TABBYLAB);
		return hmen.get(lab);
	}

}

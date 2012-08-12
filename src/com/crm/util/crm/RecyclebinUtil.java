package com.crm.util.crm;

import java.util.HashMap;

public class RecyclebinUtil {
	
	public static String[] getListColumn(String module){
		HashMap<String,String[]> listfieldsArray = new HashMap<String, String[]>();
		listfieldsArray.put("Accounts", new String[]{"accountname","customernum","keycontact","keymobile","phone","email1","rating","latestnote","smownerid"});
		return listfieldsArray.get(module);
	}
	
}

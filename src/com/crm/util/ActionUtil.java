package com.crm.util;

import java.util.HashMap;
import java.util.List;

import org.springframework.ui.ModelMap;

import com.crm.action.util.ModuleUtil;
import com.crm.model.XmEntityname;
import com.crm.model.XmParenttab;
import com.crm.model.XmTab;
import com.crm.util.crm.CustomViewUtil;

public class ActionUtil {
	public static void setTitle(String entitytype,int ptb,ModelMap modelmap,ModuleUtil moduleUtil){
		
		modelmap.addAttribute("entitytype",entitytype);
		
		XmTab tab = CustomViewUtil.getTabByName(entitytype);
		modelmap.addAttribute("tab", tab);
		
		HashMap<Integer, XmParenttab> parenttabs = (HashMap<Integer, XmParenttab>)CacheManager.getFromCache(Constant.PARENTTAB);
		XmParenttab parenttab = parenttabs.get(ptb);
		modelmap.addAttribute("ptb",parenttab);
		
		moduleUtil.setViewProp(modelmap, entitytype, tab);
		
		XmEntityname entityname = CustomViewUtil.getEntitynameByET(entitytype);
		modelmap.addAttribute("viewid", entityname.getEntityidfield());
		modelmap.addAttribute("entityname", entityname);
		
	}
}

package com.crm.service.system.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.crm.MenuBar;
import com.crm.model.XmEntityname;
import com.crm.model.XmParenttab;
import com.crm.model.XmTab;
import com.crm.service.XmEntitynameService;
import com.crm.service.XmTabService;
import com.crm.service.settings.system.XmParenttabService;
import com.crm.service.system.CacheDataService;
import com.crm.util.CacheManager;
import com.crm.util.Constant;

@Service("cacheDataService")
public class CacheDataServiceImpl implements CacheDataService {

	XmEntitynameService xmEntitynameService;
	@Resource(name = "xmEntitynameService")
	public void setXmEntitynameService(XmEntitynameService xmEntitynameService) {
		this.xmEntitynameService = xmEntitynameService;
	}

	XmParenttabService xmParenttabService;
	@Resource(name = "xmParenttabService")
	public void setXmParenttabService(XmParenttabService xmParenttabService) {
		this.xmParenttabService = xmParenttabService;
	}

	XmTabService xmTabService;
	@Resource(name = "xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}
	
	@Override
	public void initData() {
		initGlobalData();
		initMenuBar();
	}
	
	public void initGlobalData(){
		if (CacheManager.getFromCache(Constant.ENTITYNAME) == null) {
			HashMap<String, XmEntityname> hmentityname = new HashMap<String, XmEntityname>();
			HashMap<String, XmEntityname> hmbyid = new HashMap<String, XmEntityname>();
			HashMap<String, XmEntityname> hmbyid_noline = new HashMap<String, XmEntityname>();
			List<XmEntityname> ens = this.xmEntitynameService.getEntityname();
			for (int i = 0; i < ens.size(); i++) {
				hmentityname.put(ens.get(i).getModulename().toLowerCase(),
						ens.get(i));
				hmbyid.put(ens.get(i).getEntityidfield(), ens.get(i));
				hmbyid_noline.put(ens.get(i).getEntityidfield().replace("_", ""), ens.get(i));
			}
			CacheManager.putInCache(Constant.TABBYEID, hmbyid);
			CacheManager.putInCache(Constant.ENTITYNAME, hmentityname);
			CacheManager.putInCache(Constant.ENTITYNAME_NOLINE, hmbyid_noline);
		}

		if (CacheManager.getFromCache(Constant.TAB) == null) {
			HashMap<String, XmTab> tabOfName = new HashMap<String, XmTab>();
			HashMap<String, XmTab> hmlabtabs = new HashMap<String, XmTab>();
			List<XmTab> tabs = this.xmTabService.getAll();
			for (int i = 0; i < tabs.size(); i++) {
				tabOfName.put(tabs.get(i).getName().toLowerCase(),
						tabs.get(i));
				hmlabtabs.put(tabs.get(i).getTablabel().toLowerCase(),
						tabs.get(i));
			}
			CacheManager.putInCache(Constant.TAB, tabOfName);
			CacheManager.putInCache(Constant.TABBYLAB, hmlabtabs);
		}
		
	}
	
	public void initMenuBar(){
		if (CacheManager.getFromCache(Constant.MENUBAR) == null) {
			List<MenuBar> menubar = new ArrayList<MenuBar>();
			List<XmParenttab> parenttabs = this.xmParenttabService
					.getVisibleParenttab();
			HashMap<Integer, XmParenttab> parenttab = new HashMap<Integer,XmParenttab>();
			for (int i = 0; i < parenttabs.size(); i++) {
				MenuBar menu = new MenuBar();
				menu.setParenttab(parenttabs.get(i));
				menu.setTabs(this.xmTabService.existParenttabList(parenttabs
						.get(i).getParenttabid()));
				menubar.add(menu);
				parenttab.put(parenttabs.get(i).getParenttabid(),parenttabs.get(i));
			}
			CacheManager.putInCache(Constant.MENUBAR,menubar);
			CacheManager.putInCache(Constant.PARENTTAB,parenttab);
		}
	}
	

}

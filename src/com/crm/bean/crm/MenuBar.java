package com.crm.bean.crm;

import com.crm.model.XmParenttab;
import com.crm.model.XmTab;

import java.util.*;

public class MenuBar {
	XmParenttab parenttab;
	List<XmTab> tabs;
	public XmParenttab getParenttab() {
		return parenttab;
	}
	public void setParenttab(XmParenttab parenttab) {
		this.parenttab = parenttab;
	}
	public List<XmTab> getTabs() {
		return tabs;
	}
	public void setTabs(List<XmTab> tabs) {
		this.tabs = tabs;
	}
	
}

package com.crm.service;

import java.util.List;

import com.crm.model.XmTab;

public interface XmTabService {

	XmTab getTabByName(String entitytype);

	List<XmTab> getAll();

	List<XmTab> getParentTabAll();

	List<XmTab> existParenttabList(int parenttabid);

	String getExistTabids(int parenttabid);

	List<XmTab> getHiddenParenttabs(String existtabids);

	List<XmTab> getTabPermission(int profileid);

}

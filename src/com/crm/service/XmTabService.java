package com.crm.service;

import java.util.List;

import com.crm.model.XmTab;

public interface XmTabService {

	XmTab getTabByName(String entitytype);

	List<XmTab> getAll();

}

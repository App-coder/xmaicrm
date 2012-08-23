package com.crm.settings.basic.service;

import java.util.List;

import com.crm.model.XmGroups;

public interface XmGroupsService {

	List<XmGroups> loadAll();

	XmGroups getGroupById(int groupid);

	void add(XmGroups groups);

	void update(XmGroups groups);

	void deleteById(int groupid);


}

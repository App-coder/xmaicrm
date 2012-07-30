package com.crm.settings.system.service;

import java.util.List;

import com.crm.model.XmParenttab;

public interface XmParenttabService {

	List<XmParenttab> getAll();

	XmParenttab getParenttab(int id);

	int insertParenttab(XmParenttab parenttab);

	void update(XmParenttab parenttab);

	void deleteById(int parenttabid);

	List<XmParenttab> getVisibleParenttab();

}

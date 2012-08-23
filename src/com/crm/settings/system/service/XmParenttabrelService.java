package com.crm.settings.system.service;

import com.crm.model.XmParenttab;
import com.crm.model.XmParenttabrel;

public interface XmParenttabrelService {

	void clearRelByParentid(int parenttabid);

	void insert(XmParenttabrel xmParenttabrel);


}

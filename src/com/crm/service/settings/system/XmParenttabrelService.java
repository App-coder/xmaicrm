package com.crm.service.settings.system;

import com.crm.model.XmParenttab;
import com.crm.model.XmParenttabrel;

public interface XmParenttabrelService {

	void clearRelByParentid(int parenttabid);

	void insert(XmParenttabrel xmParenttabrel);


}

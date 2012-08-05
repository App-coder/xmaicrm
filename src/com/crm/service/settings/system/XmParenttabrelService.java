package com.crm.service.settings.system;

import com.crm.model.XmParenttabrel;

public interface XmParenttabrelService {

	void clearRelByParentid(int parenttabid);

	void insert(XmParenttabrel xmParenttabrel);

	int getPtbByTabid(Integer tabid);


}

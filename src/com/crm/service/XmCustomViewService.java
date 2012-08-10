package com.crm.service;

import java.util.List;

import com.crm.model.XmCustomview;

public interface XmCustomViewService {
	List<XmCustomview> queryByEntityType(String entitytype);

	int getDefault(String string);
	

}

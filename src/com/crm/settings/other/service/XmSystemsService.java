package com.crm.settings.other.service;

import java.util.List;

import com.crm.model.XmSystems;

public interface XmSystemsService {

	List<XmSystems> getSystemsByType(String string);

	void update(XmSystems system);

}

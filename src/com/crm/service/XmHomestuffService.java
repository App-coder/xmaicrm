package com.crm.service;

import java.util.List;

import com.crm.model.XmHomestuff;

public interface XmHomestuffService {

	List<XmHomestuff> getStuffByRole(String role);

	List<XmHomestuff> getByStuffId(int hometemplatesid);

	void insert(XmHomestuff xmHomestuff);

	int deleteByStuffId(int hometemplatesid);

}

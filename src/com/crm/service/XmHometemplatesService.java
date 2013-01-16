package com.crm.service;

import java.util.List;

import com.crm.model.XmHometemplates;

public interface XmHometemplatesService {

	int getTotal();

	List<XmHometemplates> loadlist(int page, int rows);

	XmHometemplates getById(int hometemplatesid);

	int update(XmHometemplates template);

	int insert(XmHometemplates template);

	int deleteById(int hometemplatesid);


}

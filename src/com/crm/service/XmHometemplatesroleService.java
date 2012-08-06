package com.crm.service;

import java.util.List;

import com.crm.model.XmHometemplatesrole;

public interface XmHometemplatesroleService {

	List<XmHometemplatesrole> loadAll();

	List<XmHometemplatesrole> getByHometemplatesid(int hometemplatesid);

	int deleteRel(int hometemplatesid);

	void insertRel(int hometemplatesid, String[] roleid);

}

package com.crm.settings.basic.service;

import java.util.List;

import com.crm.model.XmRole;

public interface XmRoleService {

	List<Object> getRolesByParent(String parentrole,int depth);

	XmRole getRoleById(String id);

	List<XmRole> getAll();

	XmRole getUserRole(Integer id);

}

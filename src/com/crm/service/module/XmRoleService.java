package com.crm.service.module;

import java.util.List;

import com.crm.model.XmRole;

public interface XmRoleService {

	List<XmRole> loadAll();

	List<XmRole> getRolesWithoutTemplates();

	List<XmRole> getTemplatesRelRole(int hometemplatesid);

}

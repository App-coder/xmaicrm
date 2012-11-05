package com.crm.service.settings.basic;

import java.util.List;

import com.crm.model.XmUsers;
import com.crm.service.ModuleService;

public interface XmUsersService {

	List<Object> getSysUser(int page, int rows);

	int getTotal();

	List<XmUsers> getActiveUser();

	Object getUserById(int id);

	int add(XmUsers user);

	void update(XmUsers user);

	int delete(int id);

	int setDeleteStatus(int id, int delete);

	XmUsers validateUser(XmUsers user);

	List<XmUsers> getOptionsUser();


	
}

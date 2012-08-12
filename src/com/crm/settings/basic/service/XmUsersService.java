package com.crm.settings.basic.service;

import java.util.List;

import com.crm.model.XmUsers;
import com.crm.service.ModuleService;

public interface XmUsersService {

	List<Object> getSysUser(int page, int rows);

	int getTotal();

	List<XmUsers> getActiveUser();
	
}

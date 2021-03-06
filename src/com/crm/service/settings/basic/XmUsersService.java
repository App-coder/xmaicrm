package com.crm.service.settings.basic;

import java.util.List;

import com.crm.model.XmUsers;

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

	boolean existUserName(String username);

	List<Object> getRelUser(int page, int rows, String roleid);

	int getTotalRelUser(String roleid);

	XmUsers getById(Integer id);

	List<XmUsers> loadAll();

	int setUsersUnvalid();

	List<XmUsers> getOnlineusers();


	
}

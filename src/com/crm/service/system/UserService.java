package com.crm.service.system;

import com.crm.bean.crm.UserPermission;
import com.crm.model.XmUsers;

public interface UserService {

	String getNavBar(XmUsers login,String tpl,UserPermission userpermission);

	UserPermission getUserPermission(XmUsers login);

}

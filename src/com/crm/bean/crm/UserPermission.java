package com.crm.bean.crm;

import java.util.HashMap;
import java.util.List;

import com.crm.bean.crm.permission.ModulePermission;
import com.crm.model.XmProfile2globalpermissions;
import com.crm.model.XmRole;
import com.crm.model.XmUsers;

public class UserPermission {
	
	
	private XmUsers user;
	private XmRole role;
	/**
	 * 模块的权限，包括模块权限，添加，修改，编辑，删除，权限
	 */
	HashMap<String, ModulePermission> modulePermission;
	List<XmProfile2globalpermissions> globalpermissions;
	
	//用于统计用户状态计数
	private int pingnum;
	
	public HashMap<String, ModulePermission> getModulePermission() {
		return modulePermission;
	}
	public void setModulePermission(
			HashMap<String, ModulePermission> modulePermission) {
		this.modulePermission = modulePermission;
	}
	public List<XmProfile2globalpermissions> getGlobalpermissions() {
		return globalpermissions;
	}
	public void setGlobalpermissions(
			List<XmProfile2globalpermissions> globalpermissions) {
		this.globalpermissions = globalpermissions;
	}
	public XmRole getRole() {
		return role;
	}
	public void setRole(XmRole role) {
		this.role = role;
	}
	public XmUsers getUser() {
		return user;
	}
	public void setUser(XmUsers user) {
		this.user = user;
	}
	public int getPingnum() {
		return pingnum;
	}
	public void setPingnum(int pingnum) {
		this.pingnum = pingnum;
	}
	
}

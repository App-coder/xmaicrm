package com.crm.bean.crm;

import java.util.HashMap;
import java.util.List;

import com.crm.bean.crm.permission.ModulePermission;
import com.crm.model.XmProfile2globalpermissions;

public class UserPermission {
	/**
	 * 模块的权限，包括模块权限，添加，修改，编辑，删除，权限
	 */
	HashMap<String, ModulePermission> modulePermission;
	List<XmProfile2globalpermissions> globalpermissions;
	
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
	
}

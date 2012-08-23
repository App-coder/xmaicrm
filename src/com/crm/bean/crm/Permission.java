package com.crm.bean.crm;
import java.util.List;

import com.crm.bean.easyui.ListBean;
import com.crm.model.XmProfile;
import com.crm.model.XmProfile2globalpermissions;

public class Permission {
	
//	List<ModulePermission> modulePermission;
	ListBean modulePermission;
	XmProfile profile;
	//共享规则权限
	List<XmProfile2globalpermissions> profile2globalpermissions;
	
	
	public ListBean getModulePermission() {
		return modulePermission;
	}

	public void setModulePermission(ListBean modulePermission) {
		this.modulePermission = modulePermission;
	}

	public XmProfile getProfile() {
		return profile;
	}

	public void setProfile(XmProfile profile) {
		this.profile = profile;
	}

	public List<XmProfile2globalpermissions> getProfile2globalpermissions() {
		return profile2globalpermissions;
	}

	public void setProfile2globalpermissions(
			List<XmProfile2globalpermissions> profile2globalpermissions) {
		this.profile2globalpermissions = profile2globalpermissions;
	}
	
	
	
	
	
}

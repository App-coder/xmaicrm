package com.crm.settings.basic.service;

import java.util.List;

import com.crm.model.XmProfile2standardpermissions;

public interface XmProfile2standardpermissionsService {

	List<XmProfile2standardpermissions> getStandardPermissionsByProfileId(
			int profileid);

}

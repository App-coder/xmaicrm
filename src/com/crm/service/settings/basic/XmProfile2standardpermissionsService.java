package com.crm.service.settings.basic;

import java.util.List;

import com.crm.model.XmProfile2standardpermissions;

public interface XmProfile2standardpermissionsService {

	List<XmProfile2standardpermissions> getStandardPermissionsByProfileId(
			int profileid);

}

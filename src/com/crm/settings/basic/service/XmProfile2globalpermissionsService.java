package com.crm.settings.basic.service;

import java.util.List;

import com.crm.model.XmProfile2globalpermissions;

public interface XmProfile2globalpermissionsService {

	List<XmProfile2globalpermissions> getPermissionsByProfileid(int profileid);

}

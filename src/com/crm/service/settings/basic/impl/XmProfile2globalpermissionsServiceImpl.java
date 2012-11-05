package com.crm.service.settings.basic.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmProfile2globalpermissionsMapper;
import com.crm.model.XmProfile2globalpermissions;
import com.crm.service.settings.basic.XmProfile2globalpermissionsService;

@Service("xmProfile2globalpermissionsService")
public class XmProfile2globalpermissionsServiceImpl implements XmProfile2globalpermissionsService{
	
	XmProfile2globalpermissionsMapper xmProfile2globalpermissionsMapper;
	@Resource(name="xmProfile2globalpermissionsMapper")
	public void setXmProfile2globalpermissionsMapper(
			XmProfile2globalpermissionsMapper xmProfile2globalpermissionsMapper) {
		this.xmProfile2globalpermissionsMapper = xmProfile2globalpermissionsMapper;
	}


	@Override
	public List<XmProfile2globalpermissions> getPermissionsByProfileid(
			int profileid) {
		return this.xmProfile2globalpermissionsMapper.getPermissionsByProfileid(profileid);
	}

}

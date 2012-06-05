package com.crm.service.settings.basic.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmProfile2standardpermissionsMapper;
import com.crm.model.XmProfile2standardpermissions;
import com.crm.service.settings.basic.XmProfile2standardpermissionsService;

@Service("xmProfile2standardpermissionsService")
public class XmProfile2standardpermissionsServiceImpl
		implements
			XmProfile2standardpermissionsService {
	
	XmProfile2standardpermissionsMapper xmProfile2standardpermissionsMapper;
	@Resource(name="xmProfile2standardpermissionsMapper")
	public void setXmProfile2standardpermissionsMapper(
			XmProfile2standardpermissionsMapper xmProfile2standardpermissionsMapper) {
		this.xmProfile2standardpermissionsMapper = xmProfile2standardpermissionsMapper;
	}


	@Override
	public List<XmProfile2standardpermissions> getStandardPermissionsByProfileId(
			int profileid) {
		return this.xmProfile2standardpermissionsMapper.getStandardPermissionsByProfileId(profileid);
	}

}

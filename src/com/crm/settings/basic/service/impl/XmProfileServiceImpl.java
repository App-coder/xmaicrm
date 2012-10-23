package com.crm.settings.basic.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmProfile;
import com.crm.settings.basic.mapper.XmProfileMapper;
import com.crm.settings.basic.service.XmProfileService;

@Service("xmProfileService")
public class XmProfileServiceImpl implements XmProfileService {
	
	XmProfileMapper xmProfileMapper;
	@Resource(name="xmProfileMapper")
	public void setXmProfileMapper(XmProfileMapper xmProfileMapper) {
		this.xmProfileMapper = xmProfileMapper;
	}


	@Override
	public XmProfile getProfile(int profileid) {
		return this.xmProfileMapper.selectByPrimaryKey(profileid);
	}

}

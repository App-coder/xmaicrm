package com.crm.service.settings.basic.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmProfileMapper;
import com.crm.model.XmProfile;
import com.crm.service.settings.basic.XmProfileService;

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

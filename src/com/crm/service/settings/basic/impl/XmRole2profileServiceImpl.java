package com.crm.service.settings.basic.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmRole2profileMapper;
import com.crm.service.settings.basic.XmRole2profileService;

@Service("xmRole2profileService")
public class XmRole2profileServiceImpl implements XmRole2profileService {

	XmRole2profileMapper xmRole2profileMapper;
	@Resource(name="xmRole2profileMapper")
	public void setXmRole2profileMapper(XmRole2profileMapper xmRole2profileMapper) {
		this.xmRole2profileMapper = xmRole2profileMapper;
	}


	@Override
	public int getProfileidByRoleId(String roleid) {
		return this.xmRole2profileMapper.getProfileidByRoleId(roleid);
	}

}

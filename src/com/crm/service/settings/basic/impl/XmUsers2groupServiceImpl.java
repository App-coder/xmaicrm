package com.crm.service.settings.basic.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmUsers2groupMapper;
import com.crm.model.XmUsers2group;
import com.crm.service.settings.basic.XmUsers2groupService;

@Service("xmUsers2groupService")
public class XmUsers2groupServiceImpl implements XmUsers2groupService {
	
	XmUsers2groupMapper xmUsers2groupMapper;
	@Resource(name="xmUsers2groupMapper")
	public void setXmUsers2groupMapper(XmUsers2groupMapper xmUsers2groupMapper) {
		this.xmUsers2groupMapper = xmUsers2groupMapper;
	}


	@Override
	public void add(XmUsers2group user2group) {
		this.xmUsers2groupMapper.insert(user2group);
	}


	@Override
	public void update(XmUsers2group user2group) {
		this.xmUsers2groupMapper.update(user2group);
	}


}

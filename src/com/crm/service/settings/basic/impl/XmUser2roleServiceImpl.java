package com.crm.service.settings.basic.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmUser2roleMapper;
import com.crm.model.XmUser2role;
import com.crm.service.settings.basic.XmUser2roleService;

@Service("xmUser2roleService")
public class XmUser2roleServiceImpl implements XmUser2roleService {
	
	XmUser2roleMapper xmUser2roleMapper;
	@Resource(name="xmUser2roleMapper")
	public void setXmUser2roleMapper(XmUser2roleMapper xmUser2roleMapper) {
		this.xmUser2roleMapper = xmUser2roleMapper;
	}

	@Override
	public void add(XmUser2role user2role) {
		this.xmUser2roleMapper.insert(user2role);
	}

	@Override
	public void update(XmUser2role user2role) {
		this.xmUser2roleMapper.updateByPrimaryKey(user2role);
	}

}

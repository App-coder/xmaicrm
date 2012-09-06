package com.crm.afterser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.afterser.service.XmRoleService;
import com.crm.mapper.XmRoleMapper;
import com.crm.model.XmRole;

@Service("xmRoleService")
public class XmRoleServiceImpl implements XmRoleService{

	XmRoleMapper xmRoleMapper;
	@Resource(name="xmRoleMapper")
	public void setXmRoleMapper(XmRoleMapper xmRoleMapper) {
		this.xmRoleMapper = xmRoleMapper;
	}


	@Override
	public List<XmRole> loadAll() {
		return this.xmRoleMapper.loadAll();
	}


}

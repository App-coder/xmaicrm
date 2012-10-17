package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmRole;
import com.crm.settings.basic.mapper.XmRoleMapper;
import com.crm.settings.basic.service.XmRoleService;

@Service("settings.basic.service.xmRoleService")
public class XmRoleServiceImpl implements XmRoleService {
	
	XmRoleMapper xmRoleMapper;
	@Resource(name="settings.basic.mapper.xmRoleMapper")
	public void setXmRoleMapper(XmRoleMapper xmRoleMapper) {
		this.xmRoleMapper = xmRoleMapper;
	}

	@Override
	public List<Object> getRolesByParent(String parentrole,int depth) {
		return this.xmRoleMapper.getRolesByParent(parentrole,depth);
	}

	@Override
	public XmRole getRoleById(String id) {
		return this.xmRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<XmRole> getAll() {
		return this.xmRoleMapper.getAll();
	}

}

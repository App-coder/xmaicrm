package com.crm.service.settings.basic.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmRoleMapper;
import com.crm.model.XmRole;
import com.crm.service.settings.basic.XmRoleService;

@Service("xmRoleService")
public class XmRoleServiceImpl implements XmRoleService {
	
	XmRoleMapper xmRoleMapper;
	@Resource(name="xmRoleMapper")
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

	@Override
	public XmRole getUserRole(Integer id) {
		return this.xmRoleMapper.getUserRole(id);
	}

}

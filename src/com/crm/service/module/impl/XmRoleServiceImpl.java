package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.crm.mapper.XmRoleMapper;
import com.crm.model.XmRole;
import com.crm.service.module.XmRoleService;

@Component("com.crm.service.module.impl.xmRoleService")
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


	@Override
	public List<XmRole> getRolesWithoutTemplates() {
		return this.xmRoleMapper.getRolesWithoutTemplates();
	}


	@Override
	public List<XmRole> getTemplatesRelRole(int hometemplatesid) {
		return this.xmRoleMapper.getTemplatesRelRole(hometemplatesid);
	}


}

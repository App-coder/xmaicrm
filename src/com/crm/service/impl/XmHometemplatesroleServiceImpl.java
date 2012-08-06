package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmHometemplatesroleMapper;
import com.crm.model.XmHometemplatesrole;
import com.crm.service.XmHometemplatesroleService;

@Service("xmHometemplatesroleService")
public class XmHometemplatesroleServiceImpl
		implements
			XmHometemplatesroleService {
	
	XmHometemplatesroleMapper xmHometemplatesroleMapper;
	@Resource(name="xmHometemplatesroleMapper")
	public void setXmHometemplatesroleMapper(
			XmHometemplatesroleMapper xmHometemplatesroleMapper) {
		this.xmHometemplatesroleMapper = xmHometemplatesroleMapper;
	}


	@Override
	public List<XmHometemplatesrole> loadAll() {
		return this.xmHometemplatesroleMapper.loadAll();
	}


	@Override
	public List<XmHometemplatesrole> getByHometemplatesid(int hometemplatesid) {
		return this.xmHometemplatesroleMapper.getByHometemplatesid(hometemplatesid);
	}


	@Override
	public int deleteRel(int hometemplatesid) {
		return this.xmHometemplatesroleMapper.delByTemplagesid(hometemplatesid);
	}


	@Override
	public void insertRel(int hometemplatesid, String[] roleid) {
		for(int i=0;i<roleid.length;i++){
			XmHometemplatesrole templatesrole = new XmHometemplatesrole();
			templatesrole.setHometemplatesid(hometemplatesid);
			templatesrole.setRoleid(roleid[i]);
			this.xmHometemplatesroleMapper.insert(templatesrole);
			
		}
	}

}

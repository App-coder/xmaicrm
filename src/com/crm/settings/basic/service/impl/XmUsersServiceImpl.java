package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmUsers;
import com.crm.service.XmSequenceService;
import com.crm.settings.basic.mapper.XmUsersMapper;
import com.crm.settings.basic.service.XmUsersService;

@Service("xmUsersService")
public class XmUsersServiceImpl implements XmUsersService{
	
	XmUsersMapper xmUsersMapper;
	@Resource(name="xmUsersMapper")
	public void setXmUsersMapper(XmUsersMapper xmUsersMapper) {
		this.xmUsersMapper = xmUsersMapper;
	}
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}

	@Override
	public List<Object> getSysUser(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmUsersMapper.getSysUser(start,rows);
	}

	@Override
	public int getTotal() {
		return this.xmUsersMapper.getTotal();
	}

	@Override
	public List<XmUsers> getActiveUser() {
		return this.xmUsersMapper.getActiveUser();
	}

	@Override
	public Object getUserById(int id) {
		return this.xmUsersMapper.getUserById(id);
	}

	@Override
	public int add(XmUsers user) {
		Integer keyid = this.xmSequenceService.getSequenceId("users");
		user.setId(keyid);
		this.xmUsersMapper.insertSelective(user);
		return keyid;
	}

	@Override
	public void update(XmUsers user) {
		this.xmUsersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int delete(int id) {
		int affectrows = this.xmUsersMapper.deleteByPrimaryKey(id);
		return affectrows;
	}



	

}

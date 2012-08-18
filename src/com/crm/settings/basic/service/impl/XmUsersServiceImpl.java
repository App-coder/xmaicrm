package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.settings.basic.mapper.XmUsersMapper;
import com.crm.settings.basic.service.XmUsersService;

@Service("xmUsersService")
public class XmUsersServiceImpl implements XmUsersService{
	
	XmUsersMapper xmUsersMapper;
	@Resource(name="xmUsersMapper")
	public void setXmUsersMapper(XmUsersMapper xmUsersMapper) {
		this.xmUsersMapper = xmUsersMapper;
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

	

}

package com.crm.service.settings.other.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.other.XmSystemsMapper;
import com.crm.model.XmSystems;
import com.crm.service.settings.other.XmSystemsService;

@Service("xmSystemsService")
public class XmSystemsServiceImpl implements XmSystemsService {
	
	XmSystemsMapper xmSystemsMapper;
	@Resource(name="xmSystemsMapper")
	public void setXmSystemsMapper(XmSystemsMapper xmSystemsMapper) {
		this.xmSystemsMapper = xmSystemsMapper;
	}


	@Override
	public List<XmSystems> getSystemsByType(String string) {
		return this.xmSystemsMapper.getSystemsByType(string);
	}


	@Override
	public void update(XmSystems system) {
		this.xmSystemsMapper.updateByPrimaryKey(system);
	}
	
}

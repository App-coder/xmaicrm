package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmGroups;
import com.crm.settings.basic.mapper.XmGroupsMapper;
import com.crm.settings.basic.service.XmGroupsService;
@Service("xmGroupsService")
public class XmGroupsServiceImpl implements XmGroupsService {
	
	XmGroupsMapper xmGroupsMapper;
	@Resource(name="xmGroupsMapper")
	public void setXmGroupsMapper(XmGroupsMapper xmGroupsMapper) {
		this.xmGroupsMapper = xmGroupsMapper;
	}


	@Override
	public List<XmGroups> loadAll() {
		return this.xmGroupsMapper.loadAll();
	}

}

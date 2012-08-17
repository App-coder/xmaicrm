package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmGroups;
import com.crm.service.XmSequenceService;
import com.crm.settings.basic.mapper.XmGroupsMapper;
import com.crm.settings.basic.service.XmGroupsService;
@Service("xmGroupsService")
public class XmGroupsServiceImpl implements XmGroupsService {
	
	XmGroupsMapper xmGroupsMapper;
	@Resource(name="xmGroupsMapper")
	public void setXmGroupsMapper(XmGroupsMapper xmGroupsMapper) {
		this.xmGroupsMapper = xmGroupsMapper;
	}

	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}

	@Override
	public List<XmGroups> loadAll() {
		return this.xmGroupsMapper.loadAll();
	}


	@Override
	public XmGroups getGroupById(int groupid) {
		return this.xmGroupsMapper.selectByPrimaryKey(groupid);
	}


	@Override
	public void add(XmGroups groups) {
		groups.setGroupid(this.xmSequenceService.getSequenceId("groups"));
		this.xmGroupsMapper.insert(groups);
	}


	@Override
	public void update(XmGroups groups) {
		this.xmGroupsMapper.updateByPrimaryKeySelective(groups);
	}

	@Override
	public void deleteById(int groupid) {
		this.xmGroupsMapper.deleteByPrimaryKey(groupid);
	}

}

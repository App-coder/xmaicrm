package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCustomviewMapper;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;

@Service("xmCustomViewService")
public class XmCustomViewServiceImpl implements XmCustomViewService {
	
    XmCustomviewMapper xmCustomviewMapper;
    @Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
	}

	public List<XmCustomview> queryByEntityType(String entitytype) {
		return this.xmCustomviewMapper.queryByEntityType(entitytype);
	}

	@Override
	public int getDefault(String string) {
		return this.xmCustomviewMapper.getDefault(string);
	}
}

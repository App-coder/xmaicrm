package com.crm.service.settings.system.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.system.XmMultifieldMapper;
import com.crm.model.XmMultifield;
import com.crm.service.settings.system.XmMultifieldService;

@Service("xmMultifieldService")
public class XmMultifieldServiceImpl implements XmMultifieldService {
	
	XmMultifieldMapper xmMultifieldMapper;
	@Resource(name="xmMultifieldMapper")
	public void setXmMultifieldMapper(XmMultifieldMapper xmMultifieldMapper) {
		this.xmMultifieldMapper = xmMultifieldMapper;
	}


	@Override
	public List<XmMultifield> getMultifield(int tabid) {
		return this.xmMultifieldMapper.getMultifield(tabid);
	}

}

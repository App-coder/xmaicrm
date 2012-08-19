package com.crm.settings.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmParenttab;
import com.crm.settings.system.mapper.XmParenttabMapper;
import com.crm.settings.system.service.XmParenttabService;

@Service("xmParenttabService")
public class XmParenttabServiceImpl implements XmParenttabService {
	
	XmParenttabMapper xmParenttabMapper;
	@Resource(name="xmParenttabMapper")
	public void setXmParenttabMapper(XmParenttabMapper xmParenttabMapper) {
		this.xmParenttabMapper = xmParenttabMapper;
	}


	@Override
	public List<XmParenttab> getAll() {
		return this.xmParenttabMapper.getAll();
	}

}

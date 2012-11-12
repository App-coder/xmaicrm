package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmCaresMapper;
import com.crm.service.module.XmCareService;

@Service("xmCareService")
public class XmCareServiceImpl implements XmCareService {
	
	XmCaresMapper xmCaresMapper;
    @Resource(name="xmCaresMapper")
	public void setXmCaresMapper(XmCaresMapper xmCaresMapper) {
    	this.xmCaresMapper = xmCaresMapper;
	}
}

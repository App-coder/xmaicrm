package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmNoteplansMapper;
import com.crm.service.module.XmNoteplansService;

@Service("xmNoteplansService")
public class XmNoteplansServiceImpl implements XmNoteplansService {
	
	XmNoteplansMapper xmNoteplansMapper;
    @Resource(name="xmNoteplansMapper")
	public void setXmNoteplansMapper(XmNoteplansMapper xmNoteplansMapper) {
    	this.xmNoteplansMapper = xmNoteplansMapper;
	}
    

}

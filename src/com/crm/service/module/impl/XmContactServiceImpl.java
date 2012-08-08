package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmContactdetailsMapper;
import com.crm.service.module.XmContactService;

@Service("xmContactService")
public class XmContactServiceImpl implements XmContactService {
	
	XmContactdetailsMapper xmContactdetailsMapper;
    @Resource(name="xmContactdetailsMapper")
	public void setXmContactdetailsMapper(XmContactdetailsMapper xmContactdetailsMapper) {
    	this.xmContactdetailsMapper = xmContactdetailsMapper;
	}
    

}

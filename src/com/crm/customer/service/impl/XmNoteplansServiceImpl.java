package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmNoteplansService;
import com.crm.customer.mapper.XmNoteplansMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmNoteplansService")
public class XmNoteplansServiceImpl implements XmNoteplansService {
	
	XmNoteplansMapper xmNoteplansMapper;
    @Resource(name="xmNoteplansMapper")
	public void setXmNoteplansMapper(XmNoteplansMapper xmNoteplansMapper) {
    	this.xmNoteplansMapper = xmNoteplansMapper;
	}
    

}

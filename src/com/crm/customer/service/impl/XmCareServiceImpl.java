package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmCareService;
import com.crm.customer.mapper.XmCaresMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmCareService")
public class XmCareServiceImpl implements XmCareService {
	
	XmCaresMapper xmCaresMapper;
    @Resource(name="xmCaresMapper")
	public void setXmCaresMapper(XmCaresMapper xmCaresMapper) {
    	this.xmCaresMapper = xmCaresMapper;
	}
}

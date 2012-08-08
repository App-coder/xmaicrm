package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmPotentialMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmPotentialService;

@Service("xmPotentialService")
public class XmPotentialServiceImpl implements XmPotentialService {
	
	XmPotentialMapper xmPotentialMapper;
	@Resource(name="xmPotentialMapper")
	public void setXmPotentialMapper(XmPotentialMapper xmPotentialMapper) {
		this.xmPotentialMapper = xmPotentialMapper;
	}

	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}



}

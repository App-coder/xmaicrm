package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmQuotesMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmQuotesService;

@Service("xmQuotesService")
public class XmQuotesServiceImpl implements XmQuotesService {
	
	XmQuotesMapper xmQuotesMapper;
	@Resource(name="xmQuotesMapper")
	public void setXmQuotesMapper(XmQuotesMapper xmQuotesMapper) {
		this.xmQuotesMapper = xmQuotesMapper;
	}

	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}
	

}

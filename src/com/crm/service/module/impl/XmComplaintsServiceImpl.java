package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmComplaintsMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmComplaintsService;
@Service("xmComplaintsService")
public class XmComplaintsServiceImpl implements XmComplaintsService {
	
	XmComplaintsMapper xmComplaintsMapper;
	@Resource(name="xmComplaintsMapper")
	public void setXmComplaintsMapper(XmComplaintsMapper xmComplaintsMapper) {
		this.xmComplaintsMapper = xmComplaintsMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}

}

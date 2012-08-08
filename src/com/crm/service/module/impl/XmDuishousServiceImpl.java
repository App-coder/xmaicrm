package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmDuishousMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmDuishousService;
@Service("xmDuishousService")
public class XmDuishousServiceImpl implements XmDuishousService{
	
	XmDuishousMapper xmDuishousMapper;
	@Resource(name="xmDuishousMapper")
	public void setXmDuishousMapper(XmDuishousMapper xmDuishousMapper) {
		this.xmDuishousMapper = xmDuishousMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


}

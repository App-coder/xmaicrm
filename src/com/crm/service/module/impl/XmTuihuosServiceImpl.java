package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmTuihuosMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmTuihuosService;
@Service("xmTuihuosService")
public class XmTuihuosServiceImpl implements XmTuihuosService {

	XmTuihuosMapper xmTuihuosMapper;
	@Resource(name="xmTuihuosMapper")
	public void setXmTuihuosMapper(XmTuihuosMapper xmTuihuosMapper) {
		this.xmTuihuosMapper = xmTuihuosMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


}

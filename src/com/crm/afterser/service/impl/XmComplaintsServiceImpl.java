package com.crm.afterser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.afterser.mapper.XmComplaintsMapper;
import com.crm.afterser.service.XmComplaintsService;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmComplaints;
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

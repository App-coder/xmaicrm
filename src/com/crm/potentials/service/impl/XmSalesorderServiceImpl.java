package com.crm.potentials.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.model.XmSalesorder;
import com.crm.potentials.mapper.XmSalesorderMapper;
import com.crm.potentials.service.XmSalesorderService;

@Service("xmSalesorderService")
public class XmSalesorderServiceImpl implements XmSalesorderService {
	
	XmSalesorderMapper xmSalesorderMapper;
	@Resource(name="xmSalesorderMapper")
	public void setXmSalesorderMapper(XmSalesorderMapper xmSalesorderMapper) {
		this.xmSalesorderMapper = xmSalesorderMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


}

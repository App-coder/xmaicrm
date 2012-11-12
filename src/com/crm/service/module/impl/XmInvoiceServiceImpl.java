package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmInvoiceMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmInvoiceService;

@Service("xmInvoiceService")
public class XmInvoiceServiceImpl implements XmInvoiceService {
	
	XmInvoiceMapper xmInvoiceMapper;
	@Resource(name="xmInvoiceMapper")
	public void setXmInvoiceMapper(XmInvoiceMapper xmInvoiceMapper) {
		this.xmInvoiceMapper = xmInvoiceMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


}

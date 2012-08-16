package com.crm.potentials.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.model.XmInvoice;
import com.crm.potentials.mapper.XmInvoiceMapper;
import com.crm.potentials.service.XmInvoiceService;

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

	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmInvoiceMapper.getTotal(filter);
	}

	@Override
	public List<XmInvoice> loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmInvoiceMapper.loadList(start,rows,filter);
	}

}

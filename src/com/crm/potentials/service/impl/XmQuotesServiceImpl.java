package com.crm.potentials.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.model.XmQuotes;
import com.crm.potentials.mapper.XmQuotesMapper;
import com.crm.potentials.service.XmQuotesService;

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
	
	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmQuotesMapper.getTotal(filter);
	}

	@Override
	public List<XmQuotes> loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmQuotesMapper.loadList(start,rows,filter);
	}

}

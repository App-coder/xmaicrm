package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmNoteplansService;
import com.crm.customer.mapper.XmNoteplansMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmNoteplansService")
public class XmNoteplansServiceImpl implements XmNoteplansService {
	
	XmNoteplansMapper xmNoteplansMapper;
    @Resource(name="xmNoteplansMapper")
	public void setXmNoteplansMapper(XmNoteplansMapper xmNoteplansMapper) {
    	this.xmNoteplansMapper = xmNoteplansMapper;
	}
    
    CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmNoteplansMapper.getTotal(filter);
	}


	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmNoteplansMapper.loadList(start,rows,filter);
	}

}

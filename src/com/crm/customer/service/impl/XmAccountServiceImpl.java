package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.customer.mapper.XmAccountMapper;
import com.crm.customer.service.XmAccountService;
import com.crm.mapper.util.CvFilter;

@Service("xmAccountService")
public class XmAccountServiceImpl implements XmAccountService {
	
	XmAccountMapper xmAccountMapper;
    @Resource(name="xmAccountMapper")
	public void setAccountMapper(XmAccountMapper xmAccountMapper) {
    	this.xmAccountMapper = xmAccountMapper;
	}
    
    CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmAccountMapper.getTotal(filter);
	}


	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmAccountMapper.loadList(start,rows,filter);
	}

}

package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmCareService;
import com.crm.customer.mapper.XmCaresMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmCareService")
public class XmCareServiceImpl implements XmCareService {
	
	XmCaresMapper xmCaresMapper;
    @Resource(name="xmCaresMapper")
	public void setXmCaresMapper(XmCaresMapper xmCaresMapper) {
    	this.xmCaresMapper = xmCaresMapper;
	}
    
    CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmCaresMapper.getTotal(filter);
	}


	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmCaresMapper.loadList(start,rows,filter);
	}

}

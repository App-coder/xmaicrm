package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmContactService;
import com.crm.customer.mapper.XmContactdetailsMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmContactService")
public class XmContactServiceImpl implements XmContactService {
	
	XmContactdetailsMapper xmContactdetailsMapper;
    @Resource(name="xmContactdetailsMapper")
	public void setXmContactdetailsMapper(XmContactdetailsMapper xmContactdetailsMapper) {
    	this.xmContactdetailsMapper = xmContactdetailsMapper;
	}
    
    CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmContactdetailsMapper.getTotal(filter);
	}


	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmContactdetailsMapper.loadList(start,rows,filter);
	}

}

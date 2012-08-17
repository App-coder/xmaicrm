package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmNoteService;
import com.crm.customer.mapper.XmNotesMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmNoteService")
public class XmNoteServiceImpl implements XmNoteService {
	
	XmNotesMapper xmNotesMapper;
    @Resource(name="xmNotesMapper")
	public void setXmNotesMapper(XmNotesMapper xmNotesMapper) {
    	this.xmNotesMapper = xmNotesMapper;
	}
    
    CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmNotesMapper.getTotal(filter);
	}


	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmNotesMapper.loadList(start,rows,filter);
	}

}

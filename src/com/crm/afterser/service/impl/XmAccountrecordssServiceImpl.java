package com.crm.afterser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.afterser.mapper.XmAccountrecordssMapper;
import com.crm.afterser.service.XmAccountrecordssService;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmAccountrecordss;
@Service("xmAccountrecordssService")
public class XmAccountrecordssServiceImpl implements XmAccountrecordssService {
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}
	
	XmAccountrecordssMapper xmAccountrecordssMapper;
	@Resource(name="xmAccountrecordssMapper")
	public void setXmAccountrecordssMapper(
			XmAccountrecordssMapper xmAccountrecordssMapper) {
		this.xmAccountrecordssMapper = xmAccountrecordssMapper;
	}

	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmAccountrecordssMapper.getTotal(filter);
	}

	@Override
	public List<XmAccountrecordss> loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmAccountrecordssMapper.loadList(start,rows,filter);
	}

}

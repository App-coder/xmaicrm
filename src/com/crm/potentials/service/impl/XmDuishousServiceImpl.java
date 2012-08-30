package com.crm.potentials.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.potentials.mapper.XmDuishousMapper;
import com.crm.potentials.service.XmDuishousService;
@Service("xmDuishousService")
public class XmDuishousServiceImpl implements XmDuishousService{
	
	XmDuishousMapper xmDuishousMapper;
	@Resource(name="xmDuishousMapper")
	public void setXmDuishousMapper(XmDuishousMapper xmDuishousMapper) {
		this.xmDuishousMapper = xmDuishousMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}

	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmDuishousMapper.getTotal(filter);
	}

	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmDuishousMapper.loadList(start,rows,filter);
	}

}

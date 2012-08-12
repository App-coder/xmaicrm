package com.crm.potentials.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.potentials.mapper.XmPotentialMapper;
import com.crm.potentials.service.XmPotentialService;

@Service("xmPotentialService")
public class XmPotentialServiceImpl implements XmPotentialService {
	
	XmPotentialMapper xmPotentialMapper;
	@Resource(name="xmPotentialMapper")
	public void setXmPotentialMapper(XmPotentialMapper xmPotentialMapper) {
		this.xmPotentialMapper = xmPotentialMapper;
	}

	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}


	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmPotentialMapper.getTotal(filter);
	}


	@Override
	public List loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmPotentialMapper.loadList(start,rows,filter);
	}

}

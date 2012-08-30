package com.crm.potentials.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.model.XmTuihuos;
import com.crm.potentials.mapper.XmTuihuosMapper;
import com.crm.potentials.service.XmTuihuosService;
@Service("xmTuihuosService")
public class XmTuihuosServiceImpl implements XmTuihuosService {

	XmTuihuosMapper xmTuihuosMapper;
	@Resource(name="xmTuihuosMapper")
	public void setXmTuihuosMapper(XmTuihuosMapper xmTuihuosMapper) {
		this.xmTuihuosMapper = xmTuihuosMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}

	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmTuihuosMapper.getTotal(filter);
	}

	@Override
	public List<XmTuihuos> loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmTuihuosMapper.loadList(start,rows,filter);
	}

}

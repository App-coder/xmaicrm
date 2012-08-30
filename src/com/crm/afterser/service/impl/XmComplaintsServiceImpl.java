package com.crm.afterser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.afterser.mapper.XmComplaintsMapper;
import com.crm.afterser.service.XmComplaintsService;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmComplaints;
@Service("xmComplaintsService")
public class XmComplaintsServiceImpl implements XmComplaintsService {
	
	XmComplaintsMapper xmComplaintsMapper;
	@Resource(name="xmComplaintsMapper")
	public void setXmComplaintsMapper(XmComplaintsMapper xmComplaintsMapper) {
		this.xmComplaintsMapper = xmComplaintsMapper;
	}
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}

	@Override
	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmComplaintsMapper.getTotal(filter);
	}

	@Override
	public List<XmComplaints> loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmComplaintsMapper.loadList(start,rows,filter);
	}

}

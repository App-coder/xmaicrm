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


}

package com.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCvstdfilterMapper;
import com.crm.model.XmCvstdfilter;
import com.crm.service.XmCvstdfilterService;

@Service("xmCvstdfilterService")
public class XmCvstdfilterServiceImpl implements XmCvstdfilterService{

	XmCvstdfilterMapper xmCvstdfilterMapper;
	@Resource(name="xmCvstdfilterMapper")
	public void setXmCvstdfilterMapper(XmCvstdfilterMapper xmCvstdfilterMapper) {
		this.xmCvstdfilterMapper = xmCvstdfilterMapper;
	}


	@Override
	public void deleteCv(int cvid) {
		this.xmCvstdfilterMapper.deleteCv(cvid);
	}


	@Override
	public void insert(XmCvstdfilter stdfilter) {
		this.xmCvstdfilterMapper.insert(stdfilter);
	}


}

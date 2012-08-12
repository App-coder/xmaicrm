package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCvadvfilterMapper;
import com.crm.model.XmCvadvfilter;
import com.crm.service.XmCvadvfilterService;
@Service("xmCvadvfilterService")
public class XmCvadvfilterServiceImpl implements XmCvadvfilterService {
	
	XmCvadvfilterMapper xmCvadvfilterMapper;
	@Resource(name="xmCvadvfilterMapper")
	public void setXmCvadvfilterMapper(XmCvadvfilterMapper xmCvadvfilterMapper) {
		this.xmCvadvfilterMapper = xmCvadvfilterMapper;
	}


	@Override
	public void deleteCv(int cvid) {
		this.xmCvadvfilterMapper.deleteCv(cvid);
		
	}


	@Override
	public void insert(XmCvadvfilter advfilter) {
		this.xmCvadvfilterMapper.insert(advfilter);
	}


	@Override
	public XmCvadvfilter getAdvfilter(int viewid) {
		return this.xmCvadvfilterMapper.getAdvfilter(viewid);
	}


	@Override
	public List<XmCvadvfilter> getAdvFilters(int viewid) {
		return this.xmCvadvfilterMapper.getAdvFilters(viewid);
	}

}

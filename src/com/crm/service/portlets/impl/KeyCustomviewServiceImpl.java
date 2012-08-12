package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCustomviewMapper;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
import com.crm.service.portlets.KeyCustomviewService;

@Service("keyCustomviewService")
public class KeyCustomviewServiceImpl implements KeyCustomviewService {
	
	XmCustomviewMapper xmCustomviewMapper;
	@Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
	}
	
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}


	@Override
	public List<XmCustomview> getKeyCustomviews() {
		List<XmCustomview> keyviews = this.xmCustomviewMapper.getKeyCustomview();
		return keyviews;
	}


	@Override
	public int getCountOfView(XmCustomview xmCustomview) {
		return 0;
	}

	
}

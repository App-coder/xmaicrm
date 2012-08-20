package com.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmSeattachmentsrelMapper;
import com.crm.model.XmSeattachmentsrel;
import com.crm.service.XmSeattachmentsrelService;

@Service("xmSeattachmentsrelService")
public class XmSeattachmentsrelServiceImpl implements XmSeattachmentsrelService {

	XmSeattachmentsrelMapper xmSeattachmentsrelMapper;
	@Resource(name="xmSeattachmentsrelMapper")
	public void setXmSeattachmentsrelMapper(
			XmSeattachmentsrelMapper xmSeattachmentsrelMapper) {
		this.xmSeattachmentsrelMapper = xmSeattachmentsrelMapper;
	}


	@Override
	public void insert(XmSeattachmentsrel rel) {
		this.xmSeattachmentsrelMapper.insert(rel);
	}

	
	
}

package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmAccountrecordssMapper;
import com.crm.service.module.XmAccountrecordssService;
@Service("xmAccountrecordssService")
public class XmAccountrecordssServiceImpl implements XmAccountrecordssService {
	XmAccountrecordssMapper xmAccountrecordssMapper;
	@Resource(name="xmAccountrecordssMapper")
	public void setXmAccountrecordssMapper(
			XmAccountrecordssMapper xmAccountrecordssMapper) {
		this.xmAccountrecordssMapper = xmAccountrecordssMapper;
	}


}

package com.crm.afterser.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.afterser.mapper.XmAccountrecordssMapper;
import com.crm.afterser.service.XmAccountrecordssService;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmAccountrecordss;
@Service("xmAccountrecordssService")
public class XmAccountrecordssServiceImpl implements XmAccountrecordssService {
	XmAccountrecordssMapper xmAccountrecordssMapper;
	@Resource(name="xmAccountrecordssMapper")
	public void setXmAccountrecordssMapper(
			XmAccountrecordssMapper xmAccountrecordssMapper) {
		this.xmAccountrecordssMapper = xmAccountrecordssMapper;
	}


}

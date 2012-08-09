package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmPicklistMapper;
import com.crm.service.XmPicklistService;
@Service("xmPicklistService")
public class XmPicklistServiceImpl implements XmPicklistService {
	
	XmPicklistMapper xmPicklistMapper;
	@Resource(name="xmPicklistMapper")
	public void setXmPicklistMapper(XmPicklistMapper xmPicklistMapper) {
		this.xmPicklistMapper = xmPicklistMapper;
	}


	@Override
	public List<Object> getPickList(String pickfieldcolname) {
		return this.xmPicklistMapper.getPickList(pickfieldcolname);
	}

}

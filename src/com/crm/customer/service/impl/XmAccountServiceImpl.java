package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.customer.mapper.XmAccountMapper;
import com.crm.customer.service.XmAccountService;
import com.crm.mapper.util.CvFilter;

@Service("xmAccountService")
public class XmAccountServiceImpl implements XmAccountService {
	
	XmAccountMapper xmAccountMapper;
	@Resource(name="xmAccountMapper")
	public void setXmAccountMapper(XmAccountMapper xmAccountMapper) {
		this.xmAccountMapper = xmAccountMapper;
	}
    

}

package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmAccountMapper;
import com.crm.service.module.XmAccountService;

@Service("xmAccountService")
public class XmAccountServiceImpl implements XmAccountService {
	
	XmAccountMapper xmAccountMapper;
	@Resource(name="xmAccountMapper")
	public void setXmAccountMapper(XmAccountMapper xmAccountMapper) {
		this.xmAccountMapper = xmAccountMapper;
	}
	@Override
	public String getNewAccounts(String year) {
		return this.xmAccountMapper.getNewAccounts(year);
	}
    

}

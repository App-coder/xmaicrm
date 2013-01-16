package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmAccountMapper;
import com.crm.model.XmAccount;
import com.crm.service.portlets.XmAccountService;

@Component("com.crm.service.portlets.impl.xmAccountService")
public class XmAccountServiceImpl implements XmAccountService {
	
	XmAccountMapper xmAccountMapper;
	@Resource(name="xmAccountMapper")
	public void setXmAccountMapper(XmAccountMapper xmAccountMapper) {
		this.xmAccountMapper = xmAccountMapper;
	}


	@Override
	public List<XmAccount> getTodayaccount(String smownerid,String contactdate) {
		return this.xmAccountMapper.getTodayaccount(smownerid,contactdate);
	}

}

package com.crm.service.settings.other.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.other.XmMessageaccountMapper;
import com.crm.model.XmMessageaccount;
import com.crm.service.settings.other.XmMessageaccountService;
@Service("xmMessageaccountService")
public class XmMessageaccountServiceImpl implements XmMessageaccountService {
	
	XmMessageaccountMapper xmMessageaccountMapper;
	@Resource(name="xmMessageaccountMapper")
	public void setXmMessageaccountMapper(
			XmMessageaccountMapper xmMessageaccountMapper) {
		this.xmMessageaccountMapper = xmMessageaccountMapper;
	}


	@Override
	public XmMessageaccount getMessageAccount() {
		return this.xmMessageaccountMapper.getMessageAccount();
	}
	
}

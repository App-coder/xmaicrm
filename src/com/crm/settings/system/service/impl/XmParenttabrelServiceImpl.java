package com.crm.settings.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmParenttab;
import com.crm.model.XmParenttabrel;
import com.crm.settings.system.mapper.XmParenttabrelMapper;
import com.crm.settings.system.service.XmParenttabrelService;
@Service("xmParenttabrelService")
public class XmParenttabrelServiceImpl implements XmParenttabrelService {

	XmParenttabrelMapper xmParenttabrelMapper;
	@Resource(name="xmParenttabrelMapper")
	public void setXmParenttabrelMapper(XmParenttabrelMapper xmParenttabrelMapper) {
		this.xmParenttabrelMapper = xmParenttabrelMapper;
	}

	@Override
	public void clearRelByParentid(int parenttabid) {
		this.xmParenttabrelMapper.clearRelByParentid(parenttabid);
	}

	@Override
	public void insert(XmParenttabrel xmParenttabrel) {
		this.xmParenttabrelMapper.insert(xmParenttabrel);
	}

	
	
}

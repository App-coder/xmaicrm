package com.crm.service.settings.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.system.XmParenttabrelMapper;
import com.crm.model.XmParenttabrel;
import com.crm.service.settings.system.XmParenttabrelService;
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

	@Override
	public int getPtbByTabid(Integer tabid) {
		return this.xmParenttabrelMapper.getPtbByTabid(tabid);
	}

	
	
}

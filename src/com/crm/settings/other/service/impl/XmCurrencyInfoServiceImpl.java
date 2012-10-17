package com.crm.settings.other.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmCurrencyInfo;
import com.crm.settings.other.mapper.XmCurrencyInfoMapper;
import com.crm.settings.other.service.XmCurrencyInfoService;

@Service("xmCurrencyInfoService")
public class XmCurrencyInfoServiceImpl implements XmCurrencyInfoService {
	
	XmCurrencyInfoMapper xmCurrencyInfoMapper;
	@Resource(name="xmCurrencyInfoMapper")
	public void setXmCurrencyInfoMapper(XmCurrencyInfoMapper xmCurrencyInfoMapper) {
		this.xmCurrencyInfoMapper = xmCurrencyInfoMapper;
	}


	@Override
	public List<XmCurrencyInfo> getAll() {
		return this.xmCurrencyInfoMapper.getAll();
	}

}

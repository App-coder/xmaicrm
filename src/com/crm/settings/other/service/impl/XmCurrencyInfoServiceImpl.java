package com.crm.settings.other.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmCurrencyInfo;
import com.crm.service.XmSequenceService;
import com.crm.settings.other.mapper.XmCurrencyInfoMapper;
import com.crm.settings.other.service.XmCurrencyInfoService;

@Service("xmCurrencyInfoService")
public class XmCurrencyInfoServiceImpl implements XmCurrencyInfoService {
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}
	
	XmCurrencyInfoMapper xmCurrencyInfoMapper;
	@Resource(name="xmCurrencyInfoMapper")
	public void setXmCurrencyInfoMapper(XmCurrencyInfoMapper xmCurrencyInfoMapper) {
		this.xmCurrencyInfoMapper = xmCurrencyInfoMapper;
	}


	@Override
	public List<XmCurrencyInfo> getAll() {
		return this.xmCurrencyInfoMapper.getAll();
	}


	@Override
	public void update(XmCurrencyInfo currency) {
		this.xmCurrencyInfoMapper.updateByPrimaryKey(currency);
	}


	@Override
	public void insert(XmCurrencyInfo currency) {
		Integer keyid = this.xmSequenceService.getSequenceId("currency_info");
		currency.setId(keyid);
		this.xmCurrencyInfoMapper.insert(currency);
	}


	@Override
	public Object getCurrencyById(int cid) {
		return this.xmCurrencyInfoMapper.selectByPrimaryKey(cid);
	}


	@Override
	public void deleteById(int cid) {
		this.xmCurrencyInfoMapper.deleteByPrimaryKey(cid);
	}

}

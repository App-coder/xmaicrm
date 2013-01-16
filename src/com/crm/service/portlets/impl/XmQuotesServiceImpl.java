package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmQuotesMapper;
import com.crm.model.XmQuotes;
import com.crm.service.portlets.XmQuotesService;

@Component("com.crm.service.portlets.impl.xmQuotesService")
public class XmQuotesServiceImpl implements XmQuotesService {
	
	XmQuotesMapper xmQuotesMapper;
	@Resource(name="xmQuotesMapper")
	public void setXmQuotesMapper(XmQuotesMapper xmQuotesMapper) {
		this.xmQuotesMapper = xmQuotesMapper;
	}


	@Override
	public List<XmQuotes> getTopQuote(Integer id) {
		return this.xmQuotesMapper.getTopQuote(id);
	}

}

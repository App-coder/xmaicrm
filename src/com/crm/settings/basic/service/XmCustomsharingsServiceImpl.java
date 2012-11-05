package com.crm.settings.basic.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmCustomsharings;
import com.crm.settings.basic.mapper.XmCustomsharingsMapper;
@Service("xmCustomsharingsService")
public class XmCustomsharingsServiceImpl implements XmCustomsharingsService {
	
	XmCustomsharingsMapper xmCustomsharingsMapper;
	@Resource(name="xmCustomsharingsMapper")
	public void setXmCustomsharingsMapper(
			XmCustomsharingsMapper xmCustomsharingsMapper) {
		this.xmCustomsharingsMapper = xmCustomsharingsMapper;
	}


	@Override
	public List<XmCustomsharings> getShares(int tabid) {
		return this.xmCustomsharingsMapper.getShares(tabid);
	}

}

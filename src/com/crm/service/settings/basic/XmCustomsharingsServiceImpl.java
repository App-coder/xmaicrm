package com.crm.service.settings.basic;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmCustomsharingsMapper;
import com.crm.model.XmCustomsharings;
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

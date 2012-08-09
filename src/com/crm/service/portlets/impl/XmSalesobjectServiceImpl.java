package com.crm.service.portlets.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.XmSalesobjectMapper;
import com.crm.mapper.module.XmSalesorderMapper;
import com.crm.service.portlets.XmSalesobjectService;
@Component("com.crm.service.portlets.impl.xmSalesobjectService")
public class XmSalesobjectServiceImpl implements XmSalesobjectService {

	XmSalesobjectMapper xmSalesobjectMapper;
	@Resource(name="xmSalesobjectMapper")
	public void setXmSalesobjectMapper(XmSalesobjectMapper xmSalesobjectMapper) {
		this.xmSalesobjectMapper = xmSalesobjectMapper;
	}



	@Override
	public String getAim(String type, String y, String m,
			Integer id) {
		return this.xmSalesobjectMapper.getAim(type,y,m,id);
	}

}

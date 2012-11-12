package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmGathersMapper;
import com.crm.model.XmGathers;
import com.crm.service.portlets.XmGathersService;
@Component("com.crm.service.portlets.impl.xmGathersService")
public class XmGathersServiceImpl implements XmGathersService {

	XmGathersMapper xmGathersMapper;
	@Resource(name="xmGathersMapper")
	public void setXmGathersMapper(XmGathersMapper xmGathersMapper) {
		this.xmGathersMapper = xmGathersMapper;
	}

	@Override
	public List<XmGathers> getGathersAll() {
		return this.xmGathersMapper.getGathersAll();
	}

	@Override
	public List<XmGathers> getCustomerCharge() {
		return this.xmGathersMapper.getCustomerCharge();
	}

	@Override
	public List<XmGathers> getSupplierCharge() {
		return this.xmGathersMapper.getSupplierCharge();
	}

}

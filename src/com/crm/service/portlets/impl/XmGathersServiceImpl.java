package com.crm.service.portlets.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public List<List<Map>> getYearGather() {
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		String fistday = year+"-01-01 00:00:00";
		String lastday = year+"-12-31 23:59:00";
		
		calendar.add(Calendar.YEAR, -1);
		int lastYear = calendar.get(Calendar.YEAR);
		String lastYearfistday = lastYear+"-01-01 00:00:00";
		String lastYearlastday = lastYear+"-12-31 23:59:00";
		
		List<List<Map>> objs = new ArrayList<List<Map>>();
		objs.add(this.xmGathersMapper.getYearGather(fistday,lastday));
		objs.add(this.xmGathersMapper.getYearGather(lastYearfistday,lastYearlastday));
		
		return objs;	
	}


}

package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmSalesorderMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.service.module.XmSalesorderService;

@Service("xmSalesorderService")
public class XmSalesorderServiceImpl implements XmSalesorderService {
	
	XmSalesorderMapper xmSalesorderMapper;
	@Resource(name="xmSalesorderMapper")
	public void setXmSalesorderMapper(XmSalesorderMapper xmSalesorderMapper) {
		this.xmSalesorderMapper = xmSalesorderMapper;
	}
	
	@Override
	public String getSum(String year, String month) {
		return this.xmSalesorderMapper.getSum(year,month);
	}
	@Override
	public String getFinished(String firstDayOfMonth, String lastDayOfMonth) {
		return this.xmSalesorderMapper.getFinished(firstDayOfMonth,lastDayOfMonth);
	}


}

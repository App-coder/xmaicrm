package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.amcharts.portlets.Salesbymonth;
import com.crm.bean.amcharts.portlets.Salesyear;
import com.crm.bean.portlets.salesyearinfo.SalesorderStat;
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

	@Override
	public List<Salesbymonth> getTopSalesByMonth(String prev, String today) {
		return this.xmSalesorderMapper.getTopSalesByMonth(prev,today);
	}

	@Override
	public List<Salesyear> getSalesOfYear(String year) {
		return this.xmSalesorderMapper.getSalesOfYear(year);
	}

	@Override
	public SalesorderStat getSalesorderStat(String year) {
		return this.xmSalesorderMapper.getSalesorderStat(year);
	}

	@Override
	public int getSaleOrderOfUserAndLast(Integer id, String start, String end) {
		return this.xmSalesorderMapper.getSaleOrderOfUserAndLast(id,start,end);
	}

	@Override
	public String getSumOfOrderByUserAndLast(Integer id, String start,
			String end) {
		return this.xmSalesorderMapper.getSumOfOrderByUserAndLast(id,start,end);
	}


}

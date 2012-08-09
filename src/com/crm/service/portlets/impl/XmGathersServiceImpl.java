package com.crm.service.portlets.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.bean.crm.portlets.GatherYear;
import com.crm.bean.crm.portlets.salesyearinfo.GatherStat;
import com.crm.mapper.module.XmGathersMapper;
import com.crm.model.XmGathers;
import com.crm.service.portlets.XmGathersService;
import com.crm.util.DateUtil;
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
	public List<List<GatherYear>> getYearGather() {
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		String fistday = year+"-01-01 00:00:00";
		String lastday = year+"-12-31 23:59:00";
		
		calendar.add(Calendar.YEAR, -1);
		int lastYear = calendar.get(Calendar.YEAR);
		String lastYearfistday = lastYear+"-01-01 00:00:00";
		String lastYearlastday = lastYear+"-12-31 23:59:00";
		
		List<List<GatherYear>> objs = new ArrayList<List<GatherYear>>();
		objs.add(this.xmGathersMapper.getYearGather(fistday,lastday));
		objs.add(this.xmGathersMapper.getYearGather(lastYearfistday,lastYearlastday));
		
		return objs;	
	}

	@Override
	public String getSum(String year, String month) {
		return this.xmGathersMapper.getSum(year,month);
	}

	@Override
	public String getFinished(String firstDayOfMonth, String lastDayOfMonth) {
		return this.xmGathersMapper.getFinished(firstDayOfMonth,lastDayOfMonth);
	}

	@Override
	public GatherStat getGatherStat(String year) {
		return this.xmGathersMapper.getGatherStat(year);
	}

	@Override
	public String getSumOfGatherByUserAndLast(Integer id, String start,
			String end) {
		return this.xmGathersMapper.getSumOfGatherByUserAndLast(id,start,end);
	}

	@Override
	public List<XmGathers> getTopGather(int userid) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 1);
		
		String now = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		String next  = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);

		return this.xmGathersMapper.getTopGather(userid,now,next);
	}

}

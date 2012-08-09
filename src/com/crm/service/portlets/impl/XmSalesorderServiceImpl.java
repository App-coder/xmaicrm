package com.crm.service.portlets.impl;

import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.bean.crm.portlets.UserSalesbymonth;
import com.crm.mapper.module.XmSalesorderMapper;
import com.crm.model.XmSalesorder;
import com.crm.service.portlets.XmSalesorderService;
import com.crm.util.DateUtil;
import com.crm.util.time.TimeGet;

@Component("com.crm.service.portlets.impl.xmSalesorderService")
public class XmSalesorderServiceImpl implements XmSalesorderService {
	
	XmSalesorderMapper xmSalesorderMapper;
	@Resource(name="xmSalesorderMapper")
	public void setXmSalesorderMapper(XmSalesorderMapper xmSalesorderMapper) {
		this.xmSalesorderMapper = xmSalesorderMapper;
	}


	@Override
	public List<XmSalesorder> getTopSalesorder(Integer userid) {
		return this.xmSalesorderMapper.getTopSalesorder(userid);
	}


	@Override
	public List<UserSalesbymonth> getUserSalesbymonth(Integer userid) {
		Calendar start = Calendar.getInstance();
		start.add(Calendar.MONTH, -7);
		
		TimeGet tg = new TimeGet();
		
		String sday = DateUtil.format(start.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		String eday = tg.getFirstDayOfMonth();
				
		return this.xmSalesorderMapper.getUserSalesbymonth(userid,sday,eday);
	}


	@Override
	public String getFinish(String firstDayOfMonth, String lastDayOfMonth,
			Integer userid) {
		return this.xmSalesorderMapper.getFinishedByUser(firstDayOfMonth, lastDayOfMonth,userid);
	}

}

package com.crm.service.portlets.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmExpensesMapper;
import com.crm.model.XmExpenses;
import com.crm.service.portlets.XmExpensesService;
import com.crm.util.DateUtil;
import com.crm.util.time.TimeGet;

@Component("com.crm.service.portlets.impl.xmExpensesService")
public class XmExpensesServiceImpl implements XmExpensesService {
	
	XmExpensesMapper xmExpensesMapper;
	@Resource(name="xmExpensesMapper")
	public void setXmExpensesMapper(XmExpensesMapper xmExpensesMapper) {
		this.xmExpensesMapper = xmExpensesMapper;
	}


	@Override
	public List<XmExpenses> getExpensesmonth() {
		TimeGet tg = new TimeGet();
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		
		String prevday = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		String today = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		
		calendar.add(Calendar.MONTH, 2);
		String nextday = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		
		return this.xmExpensesMapper.getExpensesmonth(today,prevday,nextday);
	}

}

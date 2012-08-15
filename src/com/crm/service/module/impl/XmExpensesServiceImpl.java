package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.portlets.salesyearinfo.ExpensesStat;
import com.crm.mapper.module.XmExpensesMapper;
import com.crm.service.module.XmExpensesService;

@Service("xmExpensesService")
public class XmExpensesServiceImpl implements XmExpensesService{
	
	XmExpensesMapper xmExpensesMapper;
	@Resource(name="xmExpensesMapper")
	public void setXmExpensesMapper(XmExpensesMapper xmExpensesMapper) {
		this.xmExpensesMapper = xmExpensesMapper;
	}


	@Override
	public ExpensesStat getExpensesStat(String year) {
		return this.xmExpensesMapper.getExpensesStat(year);
	}


}

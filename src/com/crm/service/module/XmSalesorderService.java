package com.crm.service.module;

import java.util.List;

import com.crm.bean.amcharts.portlets.Salesbymonth;
import com.crm.bean.amcharts.portlets.Salesyear;
import com.crm.bean.crm.portlets.salesyearinfo.SalesorderStat;


public interface XmSalesorderService {

	String getSum(String year, String month);

	String getFinished(String firstDayOfMonth, String lastDayOfMonth);

	List<Salesbymonth> getTopSalesByMonth(String prev, String today);

	List<Salesyear> getSalesOfYear(String year);

	SalesorderStat getSalesorderStat(String year);

	int getSaleOrderOfUserAndLast(Integer id, String start, String end);

	String getSumOfOrderByUserAndLast(Integer id, String start, String end);

}

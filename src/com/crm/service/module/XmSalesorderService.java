package com.crm.service.module;

import java.util.List;

import com.crm.bean.amcharts.portlets.Salesbymonth;
import com.crm.bean.amcharts.portlets.Salesyear;


public interface XmSalesorderService {

	String getSum(String year, String month);

	String getFinished(String firstDayOfMonth, String lastDayOfMonth);

	List<Salesbymonth> getTopSalesByMonth(String prev, String today);

	List<Salesyear> getSalesOfYear(String year);

}

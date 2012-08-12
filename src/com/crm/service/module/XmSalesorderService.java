package com.crm.service.module;


public interface XmSalesorderService {

	String getSum(String year, String month);

	String getFinished(String firstDayOfMonth, String lastDayOfMonth);

}

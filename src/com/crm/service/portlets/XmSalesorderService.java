package com.crm.service.portlets;

import java.util.List;

import com.crm.bean.crm.portlets.UserSalesbymonth;
import com.crm.model.XmSalesorder;

public interface XmSalesorderService {

	List<XmSalesorder> getTopSalesorder(Integer userid);

	List<UserSalesbymonth> getUserSalesbymonth(Integer userid);

	/**
	 * 
	 * 每月完成多少销售订单
	 * 
	 * @param firstDayOfMonth
	 * @param lastDayOfMonth
	 * @param id
	 * @return
	 */
	String getFinish(String firstDayOfMonth, String lastDayOfMonth, Integer userid);

}

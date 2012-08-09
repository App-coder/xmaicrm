package com.crm.service.portlets;

import java.util.List;

import com.crm.bean.crm.portlets.UserSalesbymonth;
import com.crm.model.XmSalesorder;

public interface XmSalesorderService {

	List<XmSalesorder> getTopSalesorder(Integer userid);

	List<UserSalesbymonth> getUserSalesbymonth(Integer userid);

}

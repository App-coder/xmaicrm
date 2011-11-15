package com.crm.service.portlets;

import java.util.List;

import com.crm.bean.crm.portlets.GatherYear;
import com.crm.bean.portlets.salesyearinfo.GatherStat;
import com.crm.model.XmGathers;

public interface XmGathersService {

	List<XmGathers> getGathersAll();

	List<XmGathers> getCustomerCharge();

	List<XmGathers> getSupplierCharge();

	List<List<GatherYear>> getYearGather();

	String getSum(String year, String month);

	String getFinished(String firstDayOfMonth, String lastDayOfMonth);

	GatherStat getGatherStat(String year);


}

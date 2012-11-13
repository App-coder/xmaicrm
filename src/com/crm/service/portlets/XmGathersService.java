package com.crm.service.portlets;

import java.util.List;
import java.util.Map;

import com.crm.model.XmGathers;

public interface XmGathersService {

	List<XmGathers> getGathersAll();

	List<XmGathers> getCustomerCharge();

	List<XmGathers> getSupplierCharge();

	List<List<Map>> getYearGather();


}

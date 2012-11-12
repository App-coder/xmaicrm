package com.crm.service.portlets;

import java.util.List;

import com.crm.model.XmGathers;

public interface XmGathersService {

	List<XmGathers> getGathersAll();

	List<XmGathers> getCustomerCharge();

	List<XmGathers> getSupplierCharge();

}

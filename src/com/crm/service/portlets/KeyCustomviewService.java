package com.crm.service.portlets;

import java.util.List;

import com.crm.model.XmCustomview;

public interface KeyCustomviewService {

	List<XmCustomview> getKeyCustomviews();

	int getCountOfView(XmCustomview xmCustomview);


}

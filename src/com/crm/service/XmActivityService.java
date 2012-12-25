package com.crm.service;

import java.util.List;

import com.crm.model.XmActivity;

public interface XmActivityService {

	int getTotalForGetActivities(int crmid);

	List<XmActivity> getActivities(int page, int rows, int crmid);

}

package com.crm.settings.basic.service;

import java.util.List;

import com.crm.model.XmLoginhistory;

public interface XmLoginhistoryService {

	List<XmLoginhistory> getHistoryByName(int page, int rows, String username);

	int getTotalByName(String username);

}

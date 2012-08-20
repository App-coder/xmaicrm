package com.crm.service.module;

import java.util.List;

import com.crm.model.XmMaillist;

public interface XmMaillistService {

	int getTotal();

	List<XmMaillist> getList(int page, int rows);

}

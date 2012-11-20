package com.crm.service.module;

import java.util.List;

import com.crm.model.XmQunfa;

public interface XmQunfaService {

	int getTotal();

	List<XmQunfa> getList(int page, int rows);

}

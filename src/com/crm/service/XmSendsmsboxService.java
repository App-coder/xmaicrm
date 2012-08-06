package com.crm.service;

import java.util.List;

import com.crm.model.XmSendsmsbox;

public interface XmSendsmsboxService {

	List<XmSendsmsbox> loadList(int page, int rows, int userid);

	int getTotal(Integer id);


}

package com.crm.service.settings.other;

import java.util.List;

import com.crm.model.XmCangkus;

public interface XmCangkusService {

	List<Object> getList();

	void setStatus(int cangkusid,int isused);

	List<Object> getCangkussets();

	List<XmCangkus> getCangkus();

}

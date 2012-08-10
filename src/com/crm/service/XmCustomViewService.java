package com.crm.service;

import java.util.List;

import com.crm.model.XmCustomview;

public interface XmCustomViewService {
	List<XmCustomview> queryByEntityType(String entitytype);

	int getDefault(String string);

	XmCustomview selectByPrimaryKey(String entitytype, int viewid);

	List<XmCustomview> loadCViewByEntitytype(String entitytype);

	List<XmCustomview> loadList(String entitytype);

	boolean setDef(int cvid, String entitytype);

	boolean deleteCv(int cvid);

	Integer insert(XmCustomview cv);

	void update(XmCustomview cv);

	

}

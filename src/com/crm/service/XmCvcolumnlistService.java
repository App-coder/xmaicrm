package com.crm.service;

import java.util.List;

import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvcolumnlist;

public interface XmCvcolumnlistService {

	List<XmCvcolumnlist> getXmCvcolumnlistByCvid(int viewid);
	
	List<CVColumn> getViewColumn(XmCustomview customview);

	void deleteCv(int cvid);

	void insert(XmCvcolumnlist col);

	void deleteCvColumnlistByCvid(Integer id);

	List<CVColumn> getColumns(XmCustomview customview);


}

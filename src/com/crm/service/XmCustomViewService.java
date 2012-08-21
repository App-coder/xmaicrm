package com.crm.service;

import java.util.List;
import java.util.Map;

import com.crm.bean.easyui.expand.CVColumn;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;

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

	XmCustomview getView(int viewid);

	int getTotal(int viewid, XmCustomview customview, XmCvstdfilter stdfilter,
			List<XmCvadvfilter> advfilter, List<CVColumn> cols);

	List<Map> loadList(int page, int rows, int viewid,
			XmCustomview customview, XmCvstdfilter stdfilter,
			List<XmCvadvfilter> advfilter, List<CVColumn> cols);

	List<XmCustomview> loadList(String entitytype, int page, int rows);

	int getTotal(String entitytype);


	List<Object> getChartData(String grouptype, List<CVColumn> cols,
			String pickfieldtable, String pickfieldname, String pickfieldcolname);

	XmCustomview selectByPrimaryKey(int cvid);

	

}

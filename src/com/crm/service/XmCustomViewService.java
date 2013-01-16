package com.crm.service;

import java.util.List;
import java.util.Map;

import com.crm.bean.easyui.expand.CVColumn;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.model.XmEntityname;

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
			List<XmCvadvfilter> advfilter, List<CVColumn> cols,String customfilter);

	List<Map> loadList(int page, int rows, int viewid,
			XmCustomview customview, XmCvstdfilter stdfilter,
			List<XmCvadvfilter> advfilter, List<CVColumn> cols,String customfilter);

	List<XmCustomview> loadList(String entitytype, int page, int rows);

	int getTotal(String entitytype);


	List<Object> getChartData(String grouptype, List<CVColumn> cols,
			String pickfieldtable, String pickfieldname, String pickfieldcolname);

	XmCustomview selectByPrimaryKey(int cvid);

	int insert(String string);

	Map getObject(int recordid, String module);

	String getFieldValue(XmEntityname et, String mapVal);

	int update(String sql);

	/**
	 * 
	 * 获取例外值
	 * 
	 * @param module
	 * @param val
	 * @param column
	 * @return
	 */
	String getModuleVal(String module, String val,String column);

	

}

package com.crm.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.ModelMap;

import com.crm.bean.easyui.expand.CVColumn;
import com.crm.model.XmContactdetails;
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

	/**
	 * 
	 * 通过联系人ID，获取客户
	 * 
	 * @param contactid
	 * @return
	 */
	int getAccountByContactid(String contactid);

	/**
	 * 
	 * 通过客户ID，获取联系人
	 * 
	 * @param accountid 客户id 
	 * @return
	 */
	List<XmContactdetails> getContactdetailsByAccountid(int accountid);

	/**
	 * 得到高级查询的条件
	 * 
	 * @param string entitytype 
	 * @param modelMap
	 * 
	 */
	void getAdvSearchFilter(String string, ModelMap modelMap);

	String getBasicSearchString(String entitytype, String basicsearchfield,
			String basicsearchvalue);

	/**
	 * 
	 * 高级查询时候的条件选择
	 * 
	 * @param advfilters
	 * @param matchMeth
	 */
	String getAdvSearchFilterString(String entitytype,String advfilters, String matchMeth);

	/**
	 * 
	 * 修改负责人
	 * 
	 * @param ids
	 * @param entitytype
	 * @param ownerid
	 * @return
	 */
	Boolean updateSmowner(String ids, String entitytype, int ownerid);



	

}

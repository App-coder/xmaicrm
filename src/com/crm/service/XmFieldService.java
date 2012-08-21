package com.crm.service;

import java.util.*;

import com.crm.model.XmField;
import com.crm.model.XmProfile2field;

public interface XmFieldService {
	
	/**
	 * 返回根据对应的表返回对应的报表字段
	 * 
	 * @param tabname 表名
	 * @return
	 */
	public List<XmField> getReportField(String tabname);

	public List<XmField> getFieldByBlockAndTab(Integer tabid, Integer blockid);

	public List<XmField> getSearchFields(Integer tabid);

	public List<XmField> getReportItems(int tabid);

	/**
	 * 根据表的ID获取，字段信息
	 * @param tabid
	 * @return
	 */
	public List<XmField> getFieldsByTabid(Integer tabid);

	
	public List<XmField> getProfileFieldsByTabid(Integer profileid,Integer tabid);

	/**
	 * 视图编辑的字段
	 * 
	 * @param tabid
	 * @param blockstr
	 * @return
	 */
	public List<XmField> getEditFields(Integer tabid, String blockstr);
	
	public List<Object> getLayoutField(Integer tabid,Integer blockid);
	
	int updateByPrimaryKeySelective(XmField xmField);

	/**
	 * 
	 * 全局字段，根据TABID，进行查询
	 * 
	 * @param tabid
	 * @return
	 */
	public List<Object> getDefOrgFields(int tabid);
	
	int submit(int tabid,String ck_fieldid,String unck_fieldid);
	
	List<Object> getProductField(String module);
	
	List<Object> getRelmodField(String module,int tabid);
}

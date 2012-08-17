package com.crm.service;

import java.util.*;

import com.crm.model.XmField;

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
}

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
}

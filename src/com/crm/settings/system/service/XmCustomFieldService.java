package com.crm.settings.system.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmField;

public interface XmCustomFieldService {
	List<XmField> getFieldsByTabid(int tabid,int start,int rows);
	
	int insertCustomField(String queryParams);
}

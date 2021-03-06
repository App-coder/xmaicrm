package com.crm.service.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmField;

public interface XmCustomFieldService {
	List<XmField> getFieldsByTabid(int tabid,int start,int rows);
	
	int insertCustomField(String queryParams);
	
	int deleteCustomField(String queryParams);
	
	int getSequence(String table);
	
	int addCfField(String tablename, String cfField);
	
	String getTableNameByTabid(int tabid);
	
	int insert(XmField record,String queryParams);
	
	int getTotal(int tabid);
	
	int updateByPrimaryKeySelective(String queryParams);
	
	
}

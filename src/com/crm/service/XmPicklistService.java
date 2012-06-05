package com.crm.service;

import java.util.List;

import com.crm.model.XmPicklist;

public interface XmPicklistService {

	List<Object> getPickList(String pickfieldcolname);

	List<XmPicklist> getPicks(String fieldname);
	
	List<Object> getPickListName(int tabid,int page,int rows);
	
	int getTotal(int tabid);
	
	List<XmPicklist> getPickListValue(String colname);
	
	int updatePickListValue(String colname,String arrpick);
	

}

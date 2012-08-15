package com.crm.service.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmMultifield;

public interface XmMultifieldService {

	List<XmMultifield> getMultifield(int tabid);
	
	List<Object> getMultiLevel1(int multifieldid);
	
	List<Object> getMultiLevelField(int thelevel,int parentfieldid,String tablename);
}

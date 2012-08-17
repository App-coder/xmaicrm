package com.crm.settings.system.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmBlocks;

public interface XmCustomBlockService {

	List<Object> getBlockList();
	
	List<XmBlocks> getFieldBlocksByTabId(int tabid,int page,int rows);
	
	int updateByPrimaryKey(String json);
	
	int deleteByPrimaryKey(String json);
}

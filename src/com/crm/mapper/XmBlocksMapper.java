package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmBlocks;

public interface XmBlocksMapper {

	List<XmBlocks> getBlocksByTabId(@Param("tabid") int tabid);

	List<XmBlocks> getFieldBlocksByTabId(@Param("tabid") Integer tabid);
	
	List<XmBlocks> getFieldBlocksByTabId(@Param("tabid") int tabid,@Param("start") int start,@Param("rows") int rows);
	
	List<Object> getBlockList();
	
	int updateByPrimaryKey(XmBlocks xmblock);
	
	int deleteByPrimaryKey(@Param("blockid") int blockid);
	
	int insert(XmBlocks xmBlock);
	
	int getMaxId();
	
	int getBlockIdByTabId(int tabid);

}

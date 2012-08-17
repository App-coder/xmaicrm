package com.crm.settings.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.crm.model.XmBlocks;
@Component("settings.system.mapper.xmBlocksMapper")  
public interface XmBlocksMapper {

	List<XmBlocks> getBlocksByTabId(@Param("tabid") int tabid);

	List<XmBlocks> getFieldBlocksByTabId(@Param("tabid") int tabid,@Param("start") int start,@Param("rows") int rows);
	
	List<Object> getBlockList();
	
	int updateByPrimaryKey(XmBlocks xmblock);
	
	int deleteByPrimaryKey(@Param("blockid") int blockid);
	

}

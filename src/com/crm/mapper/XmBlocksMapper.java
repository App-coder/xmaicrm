package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmBlocks;

public interface XmBlocksMapper {

	List<XmBlocks> getBlocksByTabId(@Param("tabid") int tabid);

	List<XmBlocks> getFieldBlocksByTabId(@Param("tabid") Integer tabid);

}

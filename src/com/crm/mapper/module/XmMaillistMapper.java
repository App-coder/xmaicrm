package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmMaillist;

public interface XmMaillistMapper {
    int deleteByPrimaryKey(Integer maillistid);

    int insert(XmMaillist record);

    int insertSelective(XmMaillist record);

    XmMaillist selectByPrimaryKey(Integer maillistid);

    int updateByPrimaryKeySelective(XmMaillist record);

    int updateByPrimaryKeyWithBLOBs(XmMaillist record);

    int updateByPrimaryKey(XmMaillist record);

	int getTotal();

	List<XmMaillist> getList(@Param("start") int start,@Param("rows") int rows);
}
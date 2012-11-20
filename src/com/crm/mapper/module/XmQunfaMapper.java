package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmQunfa;

public interface XmQunfaMapper {
    int deleteByPrimaryKey(Integer qunfaid);

    int insert(XmQunfa record);

    int insertSelective(XmQunfa record);

    XmQunfa selectByPrimaryKey(Integer qunfaid);

    int updateByPrimaryKeySelective(XmQunfa record);

    int updateByPrimaryKey(XmQunfa record);

	int getTotal();

	List<XmQunfa> getList(@Param("start") int start,@Param("rows") int rows);
}
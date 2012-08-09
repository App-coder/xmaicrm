package com.crm.mapper;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmSalesobject;

public interface XmSalesobjectMapper {
    int insert(XmSalesobject record);

    int insertSelective(XmSalesobject record);

    String getAim(@Param("type") String type,@Param("y") String y,@Param("m") String m,@Param("id") Integer id);
}
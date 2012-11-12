package com.crm.mapper.module;

import com.crm.model.XmProducts;

public interface XmProductsMapper {
    int deleteByPrimaryKey(Integer productid);

    int insert(XmProducts record);

    int insertSelective(XmProducts record);

    XmProducts selectByPrimaryKey(Integer productid);

    int updateByPrimaryKeySelective(XmProducts record);

    int updateByPrimaryKeyWithBLOBs(XmProducts record);

    int updateByPrimaryKey(XmProducts record);
}
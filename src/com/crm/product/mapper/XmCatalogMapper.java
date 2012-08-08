package com.crm.product.mapper;

import com.crm.model.XmCatalog;

public interface XmCatalogMapper {
    int deleteByPrimaryKey(String catalogid);

    int insert(XmCatalog record);

    int insertSelective(XmCatalog record);

    XmCatalog selectByPrimaryKey(String catalogid);

    int updateByPrimaryKeySelective(XmCatalog record);

    int updateByPrimaryKey(XmCatalog record);
}
package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCatalog;

public interface XmCatalogMapper {
    int deleteByPrimaryKey(String catalogid);

    int insert(XmCatalog record);

    int insertSelective(XmCatalog record);

    XmCatalog selectByPrimaryKey(String catalogid);

    int updateByPrimaryKeySelective(XmCatalog record);

    int updateByPrimaryKey(XmCatalog record);

	List<XmCatalog> getCatalogById(@Param("parentid") String parentid);

	List<XmCatalog> getCatalogAll();
}
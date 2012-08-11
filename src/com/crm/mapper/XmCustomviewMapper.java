package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCustomview;

public interface XmCustomviewMapper {
    int deleteByPrimaryKey(Integer cvid);

    int insert(XmCustomview record);

    int insertSelective(XmCustomview record);

    XmCustomview selectByPrimaryKey(Integer cvid);

    int updateByPrimaryKeySelective(XmCustomview record);

    int updateByPrimaryKey(XmCustomview record);
    
    List<XmCustomview> queryByEntityType(@Param("entitytype") String entitytype);

	int getDefault(@Param("entitytype") String entitytype);

	XmCustomview getDefaultCView(@Param("entitytype") String entitytype);
}
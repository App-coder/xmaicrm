package com.crm.mapper;

import com.crm.model.XmCustomview;

public interface XmCustomviewMapper {
    int deleteByPrimaryKey(Integer cvid);

    int insert(XmCustomview record);

    int insertSelective(XmCustomview record);

    XmCustomview selectByPrimaryKey(Integer cvid);

    int updateByPrimaryKeySelective(XmCustomview record);

    int updateByPrimaryKey(XmCustomview record);
}
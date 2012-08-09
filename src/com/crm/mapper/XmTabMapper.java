package com.crm.mapper;

import com.crm.model.XmTab;

public interface XmTabMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(XmTab record);

    int insertSelective(XmTab record);

    XmTab selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(XmTab record);

    int updateByPrimaryKey(XmTab record);
}
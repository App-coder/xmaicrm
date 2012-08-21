package com.crm.mapper.settings.system;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmRelmodfieldlist;

public interface XmRelmodfieldlistMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByModule(@Param("module") String module);

    int insert(XmRelmodfieldlist record);

    int insertSelective(XmRelmodfieldlist record);

    XmRelmodfieldlist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmRelmodfieldlist record);

    int updateByPrimaryKey(XmRelmodfieldlist record);
}
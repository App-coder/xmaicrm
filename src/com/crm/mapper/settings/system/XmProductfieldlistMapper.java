package com.crm.mapper.settings.system;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmProductfieldlist;

public interface XmProductfieldlistMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByModule(@Param("module") String module);

    int insert(XmProductfieldlist record);

    int insertSelective(XmProductfieldlist record);

    XmProductfieldlist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmProductfieldlist record);

    int updateByPrimaryKey(XmProductfieldlist record);
}
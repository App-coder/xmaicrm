package com.crm.mapper.settings.system;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmStep2users;

public interface XmStep2usersMapper {
    int insert(XmStep2users record);

    int insertSelective(XmStep2users record);
    
    int deleteByStepId(@Param("stepid") int stepid);
}
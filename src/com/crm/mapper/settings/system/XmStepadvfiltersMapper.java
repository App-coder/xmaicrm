package com.crm.mapper.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmStepadvfilters;

public interface XmStepadvfiltersMapper {
    int insert(XmStepadvfilters record);

    int insertSelective(XmStepadvfilters record);
    
    List<XmStepadvfilters> getStepAdvFilterById(@Param("stepid") int stepid);
    
    int deleteByStepId(@Param("stepid") int stepid);
}
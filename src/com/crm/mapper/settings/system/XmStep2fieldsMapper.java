package com.crm.mapper.settings.system;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmStep2fields;

public interface XmStep2fieldsMapper {
    int insert(XmStep2fields record);

    int insertSelective(XmStep2fields record);
    
    int deleteByStepId(@Param("stepid") int stepid);
    
    int updateByStepId(@Param("stepid") int stepid,@Param("fieldids") String fieldids);
    
    int updateByStepIdZero(@Param("stepid") int stepid,@Param("fieldids") String fieldids);
}
package com.crm.mapper.settings.system;
import java.util.List;

import com.crm.model.XmApprovestep;

public interface XmApprovestepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmApprovestep record);

    int insertSelective(XmApprovestep record);

    XmApprovestep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmApprovestep record);

    int updateByPrimaryKeyWithBLOBs(XmApprovestep record);

    int updateByPrimaryKey(XmApprovestep record);
    
    XmApprovestep getApproveStepById(Integer id);
    
    List<Object> getApproveStepUsers();
}
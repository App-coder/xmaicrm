package com.crm.mapper.settings.system;

import com.crm.model.XmApprove2user;

public interface XmApprove2userMapper {
    int insert(XmApprove2user record);

    int insertSelective(XmApprove2user record);
    
    int delete(int approveid);
}
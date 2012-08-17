package com.crm.customer.mapper;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmCares;

public interface XmCaresMapper extends ModuleMapper<XmCares> {
    int deleteByPrimaryKey(Integer caresid);

    int insert(XmCares record);

    int insertSelective(XmCares record);

    XmCares selectByPrimaryKey(Integer caresid);

    int updateByPrimaryKeySelective(XmCares record);

    int updateByPrimaryKeyWithBLOBs(XmCares record);

    int updateByPrimaryKey(XmCares record);
}
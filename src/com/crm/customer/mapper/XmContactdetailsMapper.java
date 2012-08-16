package com.crm.customer.mapper;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmAccount;
import com.crm.model.XmContactdetails;

public interface XmContactdetailsMapper extends ModuleMapper<XmContactdetails>{
    int deleteByPrimaryKey(Integer contactid);

    int insert(XmContactdetails record);

    int insertSelective(XmContactdetails record);

    XmContactdetails selectByPrimaryKey(Integer contactid);

    int updateByPrimaryKeySelective(XmContactdetails record);

    int updateByPrimaryKeyWithBLOBs(XmContactdetails record);

    int updateByPrimaryKey(XmContactdetails record);
}
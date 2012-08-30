package com.crm.customer.mapper;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmNoteplans;

public interface XmNoteplansMapper extends ModuleMapper<XmNoteplans> {
    int deleteByPrimaryKey(Integer noteplansid);

    int insert(XmNoteplans record);

    int insertSelective(XmNoteplans record);

    XmNoteplans selectByPrimaryKey(Integer noteplansid);

    int updateByPrimaryKeySelective(XmNoteplans record);

    int updateByPrimaryKeyWithBLOBs(XmNoteplans record);

    int updateByPrimaryKey(XmNoteplans record);
}
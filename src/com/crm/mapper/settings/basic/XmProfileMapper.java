package com.crm.mapper.settings.basic;

import java.util.List;

import com.crm.model.XmProfile;

public interface XmProfileMapper {
    int deleteByPrimaryKey(Integer profileid);

    int insert(XmProfile record);

    int insertSelective(XmProfile record);

    XmProfile selectByPrimaryKey(Integer profileid);

    int updateByPrimaryKeySelective(XmProfile record);

    int updateByPrimaryKeyWithBLOBs(XmProfile record);

    int updateByPrimaryKey(XmProfile record);
    
    List<XmProfile> selectProfileid();
}

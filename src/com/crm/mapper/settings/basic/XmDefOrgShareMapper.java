package com.crm.mapper.settings.basic;

import java.util.List;

import com.crm.model.XmDefOrgShare;

public interface XmDefOrgShareMapper {
    int deleteByPrimaryKey(Integer ruleid);

    int insert(XmDefOrgShare record);

    int insertSelective(XmDefOrgShare record);

    XmDefOrgShare selectByPrimaryKey(Integer ruleid);

    int updateByPrimaryKeySelective(XmDefOrgShare record);

    int updateByPrimaryKey(XmDefOrgShare record);

	List<Object> getShareRules();
}
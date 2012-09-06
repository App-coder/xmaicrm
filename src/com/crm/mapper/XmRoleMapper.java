package com.crm.mapper;

import java.util.List;

import com.crm.model.XmRole;

public interface XmRoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(XmRole record);

    int insertSelective(XmRole record);

    XmRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(XmRole record);

    int updateByPrimaryKey(XmRole record);

	List<XmRole> loadAll();
}
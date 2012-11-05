package com.crm.mapper.settings.basic;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmUser2role;

public interface XmUser2roleMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(XmUser2role record);

    int insertSelective(XmUser2role record);

    XmUser2role selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(XmUser2role record);

    int updateByPrimaryKey(XmUser2role record);

}
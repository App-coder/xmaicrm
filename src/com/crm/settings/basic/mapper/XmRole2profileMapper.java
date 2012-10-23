package com.crm.settings.basic.mapper;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmRole2profile;

public interface XmRole2profileMapper {
    int deleteByPrimaryKey(@Param("profileid") Integer profileid, @Param("roleid") String roleid);

    int insert(XmRole2profile record);

    int insertSelective(XmRole2profile record);

	int getProfileidByRoleId(@Param("roleid") String roleid);
}

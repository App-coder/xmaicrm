package com.crm.settings.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmUsers;

public interface XmUsersMapper {

	List<Object> getSysUser(@Param("start") int start,@Param("rows") int rows);

	int getTotal();

	List<XmUsers> getActiveUser();

}

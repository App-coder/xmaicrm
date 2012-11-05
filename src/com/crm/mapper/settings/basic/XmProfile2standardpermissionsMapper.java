package com.crm.mapper.settings.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmProfile2standardpermissions;

public interface XmProfile2standardpermissionsMapper {
    int deleteByPrimaryKey(@Param("operation") Integer operation, @Param("profileid") Integer profileid, @Param("tabid") Integer tabid);

    int insert(XmProfile2standardpermissions record);

    int insertSelective(XmProfile2standardpermissions record);

    XmProfile2standardpermissions selectByPrimaryKey(@Param("operation") Integer operation, @Param("profileid") Integer profileid, @Param("tabid") Integer tabid);

    int updateByPrimaryKeySelective(XmProfile2standardpermissions record);

    int updateByPrimaryKey(XmProfile2standardpermissions record);

	List<XmProfile2standardpermissions> getStandardPermissionsByProfileId(
			int profileid);
}

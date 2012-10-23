package com.crm.settings.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmProfile2globalpermissions;

public interface XmProfile2globalpermissionsMapper {

	List<XmProfile2globalpermissions> getPermissionsByProfileid(@Param("profileid") int profileid);
	
    int deleteByPrimaryKey(@Param("globalactionid") Integer globalactionid, @Param("profileid") Integer profileid);

    int insert(XmProfile2globalpermissions record);

    int insertSelective(XmProfile2globalpermissions record);

    XmProfile2globalpermissions selectByPrimaryKey(@Param("globalactionid") Integer globalactionid, @Param("profileid") Integer profileid);

    int updateByPrimaryKeySelective(XmProfile2globalpermissions record);

    int updateByPrimaryKey(XmProfile2globalpermissions record);
	

}

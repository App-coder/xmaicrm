package com.crm.settings.basic.mapper;

import com.crm.model.XmUsers2group;
import org.apache.ibatis.annotations.Param;

public interface XmUsers2groupMapper {
    int deleteByPrimaryKey(@Param("groupid") Integer groupid, @Param("userid") Integer userid);

    int insert(XmUsers2group record);

    int insertSelective(XmUsers2group record);

	void update(XmUsers2group user2group);
}
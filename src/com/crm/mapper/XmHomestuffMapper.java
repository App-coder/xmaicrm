package com.crm.mapper;

import java.util.List;

import com.crm.model.XmHomestuff;
import org.apache.ibatis.annotations.Param;

public interface XmHomestuffMapper {
    int deleteByPrimaryKey(@Param("stuffid") Integer stuffid, @Param("stufftype") String stufftype);

    int insert(XmHomestuff record);

    int insertSelective(XmHomestuff record);

    XmHomestuff selectByPrimaryKey(@Param("stuffid") Integer stuffid, @Param("stufftype") String stufftype);

    int updateByPrimaryKeySelective(XmHomestuff record);

    int updateByPrimaryKey(XmHomestuff record);

	List<XmHomestuff> getStuffById(int hometemplatesid);

	List<XmHomestuff> getDefaultStuff();
}
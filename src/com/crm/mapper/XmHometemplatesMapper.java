package com.crm.mapper;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmHometemplates;

public interface XmHometemplatesMapper {
    int deleteByPrimaryKey(Integer hometemplatesid);

    int insert(XmHometemplates record);

    int insertSelective(XmHometemplates record);

    XmHometemplates selectByPrimaryKey(Integer hometemplatesid);

    int updateByPrimaryKeySelective(XmHometemplates record);

    int updateByPrimaryKey(XmHometemplates record);

	int getStuffId(@Param("role") String role);
}
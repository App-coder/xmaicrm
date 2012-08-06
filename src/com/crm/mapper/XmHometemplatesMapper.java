package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmHometemplates;

public interface XmHometemplatesMapper {
    int deleteByPrimaryKey(Integer hometemplatesid);

    int insert(XmHometemplates record);

    int insertSelective(XmHometemplates record);

    XmHometemplates selectByPrimaryKey(Integer hometemplatesid);

    int updateByPrimaryKeySelective(XmHometemplates record);

    int updateByPrimaryKey(XmHometemplates record);

	String getStuffId(@Param("role") String role);

	int getTotal();

	List<XmHometemplates> loadlist(@Param("start") int start,@Param("rows") int rows);

	XmHometemplates getById(@Param("hometemplatesid") int hometemplatesid);
}
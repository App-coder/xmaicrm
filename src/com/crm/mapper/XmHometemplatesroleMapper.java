package com.crm.mapper;

import java.util.List;

import com.crm.model.XmHometemplatesrole;
import org.apache.ibatis.annotations.Param;

public interface XmHometemplatesroleMapper {
    int deleteByPrimaryKey(@Param("hometemplatesid") Integer hometemplatesid, @Param("roleid") String roleid);

    int insert(XmHometemplatesrole record);

    int insertSelective(XmHometemplatesrole record);

	List<XmHometemplatesrole> loadAll();

	List<XmHometemplatesrole> getByHometemplatesid(@Param("hometemplatesid") int hometemplatesid);

	int delByTemplagesid(@Param("hometemplatesid") int hometemplatesid);
}
package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmRole;

public interface XmRoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(XmRole record);

    int insertSelective(XmRole record);

    XmRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(XmRole record);

    int updateByPrimaryKey(XmRole record);

	List<XmRole> loadAll();
	
	List<Object> getRolesByParent(@Param("parentrole") String parentrole,@Param("depth") int depth);

	List<XmRole> getAll();

	XmRole getUserRole(@Param("id") Integer id);
	
}
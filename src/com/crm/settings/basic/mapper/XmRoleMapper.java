package com.crm.settings.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.crm.model.XmRole;
@Component("settings.basic.mapper.xmRoleMapper")  
public interface XmRoleMapper {

    int deleteByPrimaryKey(String roleid);

    int insert(XmRole record);

    int insertSelective(XmRole record);

    XmRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(XmRole record);

    int updateByPrimaryKey(XmRole record);
	
	List<Object> getRolesByParent(@Param("parentrole") String parentrole,@Param("depth") int depth);

}

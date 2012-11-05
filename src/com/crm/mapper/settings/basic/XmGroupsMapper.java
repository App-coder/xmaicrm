package com.crm.mapper.settings.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmGroups;

public interface XmGroupsMapper {

    int deleteByPrimaryKey(Integer groupid);

    int insert(XmGroups record);

    int insertSelective(XmGroups record);

    XmGroups selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(XmGroups record);

    int updateByPrimaryKeyWithBLOBs(XmGroups record);

    int updateByPrimaryKey(XmGroups record);
	
	List<XmGroups> loadAll();

	void deleteById(@Param("groupid") int groupid);


}

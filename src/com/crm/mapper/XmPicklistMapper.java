package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmPicklist;

public interface XmPicklistMapper {
    int deleteByPrimaryKey(Integer id);
    
    int deleteByColname(String colname);

    int insert(XmPicklist record);

    int insertSelective(XmPicklist record);

    XmPicklist selectByPrimaryKey(Integer id);
    
    List<XmPicklist> selectByColname(String colname);

    int updateByPrimaryKeySelective(XmPicklist record);

    int updateByPrimaryKey(XmPicklist record);

	List<Object> getPickList(@Param("pickfieldcolname") String pickfieldcolname);
}
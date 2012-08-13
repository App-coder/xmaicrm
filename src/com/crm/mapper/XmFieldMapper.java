package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmField;

public interface XmFieldMapper {

    int deleteByPrimaryKey(Integer fieldid);

    int insert(XmField record);

    int insertSelective(XmField record);

    XmField selectByPrimaryKey(Integer fieldid);

    int updateByPrimaryKeySelective(XmField record);

    int updateByPrimaryKey(XmField record);
	
	List<XmField> getReportField(@Param("tabid") Integer tabid);

}

package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCvcolumnlist;

public interface XmCvcolumnlistMapper {
    int deleteByPrimaryKey(@Param("columnindex") Integer columnindex, @Param("cvid") Integer cvid);

    int insert(XmCvcolumnlist record);

    int insertSelective(XmCvcolumnlist record);

    XmCvcolumnlist selectByPrimaryKey(@Param("columnindex") Integer columnindex, @Param("cvid") Integer cvid);

    int updateByPrimaryKeySelective(XmCvcolumnlist record);

    int updateByPrimaryKey(XmCvcolumnlist record);
    
    List<XmCvcolumnlist> getXmCvcolumnlistByCvid(@Param("cvid") Integer cvid);

	void deleteCv(@Param("cvid") Integer cvid);
}
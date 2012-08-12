package com.crm.mapper;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCvstdfilter;

public interface XmCvstdfilterMapper {
    int deleteByPrimaryKey(Integer cvid);

    int insert(XmCvstdfilter record);

    int insertSelective(XmCvstdfilter record);

    XmCvstdfilter selectByPrimaryKey(Integer cvid);

    int updateByPrimaryKeySelective(XmCvstdfilter record);

    int updateByPrimaryKey(XmCvstdfilter record);

	XmCvstdfilter getStdfilter(@Param("viewid") int viewid);

	void deleteCv(@Param("cvid") int cvid);

	XmCvstdfilter getStdfilterByCvid(@Param("viewid") int viewid);
}
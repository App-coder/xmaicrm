package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmField;
import com.crm.model.XmTab;

public interface XmTabMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(XmTab record);

    int insertSelective(XmTab record);

    XmTab selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(XmTab record);

    int updateByPrimaryKey(XmTab record);

	XmTab getTabByName(@Param("tabname") String tabname);

}
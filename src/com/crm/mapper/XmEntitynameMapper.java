package com.crm.mapper;

import java.util.List;

import com.crm.model.XmEntityname;

public interface XmEntitynameMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(XmEntityname record);

    int insertSelective(XmEntityname record);

    XmEntityname selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(XmEntityname record);

    int updateByPrimaryKey(XmEntityname record);

	List<XmEntityname> getEntityname();
}
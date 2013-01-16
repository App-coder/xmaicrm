package com.crm.mapper;

import java.util.List;

import com.crm.model.XmDefOrgField;

public interface XmDefOrgFieldMapper {
    int deleteByPrimaryKey(Integer fieldid);

    int insert(XmDefOrgField record);

    int insertSelective(XmDefOrgField record);

    XmDefOrgField selectByPrimaryKey(Integer fieldid);

    int updateByPrimaryKeySelective(XmDefOrgField record);

    int updateByPrimaryKey(XmDefOrgField record);

	List<XmDefOrgField> selectAll();
}
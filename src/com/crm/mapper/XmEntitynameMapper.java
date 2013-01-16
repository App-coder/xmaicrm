package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmEntityname;

public interface XmEntitynameMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(XmEntityname record);

    int insertSelective(XmEntityname record);

    XmEntityname selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(XmEntityname record);

    int updateByPrimaryKey(XmEntityname record);

	List<XmEntityname> getEntityname();

	XmEntityname getEntityByModule(@Param("module") String module);
	
	String getEntityApprovelogName(@Param("fieldsname") String fieldsname,@Param("tablename") String tablename,@Param("entityidfield") String entityidfield,@Param("crmid") int crmid);
}
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

	List<XmField> getFieldByBlockAndTab(@Param("tabid") Integer tabid,@Param("blockid") Integer blockid);

	List<XmField> getSearchFields(@Param("tabid") Integer tabid);

	List<XmField> getReportItems(@Param("tabid") int tabid);

	List<XmField> getFieldsByTabid(@Param("tabid") Integer tabid);

	List<XmField> getProfileFieldsByTabid(@Param("profileid") Integer profileid,@Param("tabid") Integer tabid);

	List<XmField> getEditFields(@Param("tabid") Integer tabid,@Param("blockstr") String blockstr);

}

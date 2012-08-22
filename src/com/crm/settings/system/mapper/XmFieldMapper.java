package com.crm.settings.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.crm.model.XmEntityname;
import com.crm.model.XmField;

@Component("settings.system.mapper.xmFieldMapper")
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

	List<XmField> getFieldsByTabid(@Param("tabid") Integer tabid,@Param("start") int start,@Param("rows") int rows);

	List<XmEntityname> getTableNameByTabid(@Param("tabid") Integer tabid);
	
	int addColumn(@Param("tablename") String tablename,@Param("cfField") String cfField);
}

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

	List<XmField> getFieldsByTabid(@Param("tabid") Integer tabid,@Param("start") int start,@Param("rows") int rows);
	
	int getMaxSequence(@Param("tabid") Integer tabid);

	String getTableNameByTabid(@Param("tabid") Integer tabid);
	
	int addColumn(@Param("tablename") String tablename,@Param("cfField") String cfField);
	
	int deleteColumn(@Param("tablename") String tablename,@Param("cfField") String cfField);
	
	int getTotal(@Param("tabid") int tabid);

	List<Object> getDefOrgFields(@Param("tabid") int tabid);
	
	List<Object> getLayoutField(@Param("tabid") Integer tabid,@Param("blockid") Integer blockid);
	
	int updateDefOrgVisible(@Param("tabid") Integer tabid,@Param("visible") Integer visible,@Param("fieldids") String fieldids);
	
	List<Object> getProductField(@Param("module") String module);
	
	List<Object> getRelmodField(@Param("module") String module,@Param("tabid") int tabid);
	
	String getProductOfFieldname(@Param("module") String module,@Param("fieldid") Integer fieldid);
}

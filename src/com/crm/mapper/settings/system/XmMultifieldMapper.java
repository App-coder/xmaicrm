package com.crm.mapper.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmMultifield;

public interface XmMultifieldMapper {
    int insert(XmMultifield record);

    int insertSelective(XmMultifield record);

	List<XmMultifield> getMultifield(@Param("tabid") int tabid);
	
	List<Object> getMultiLevel1(@Param("multifieldid") int multifieldid);
	
	List<Object> getMultiLevelField(@Param("thelevel") int thelevel,@Param("parentfieldid") int parentfieldid,@Param("tablename") String tablename);
}
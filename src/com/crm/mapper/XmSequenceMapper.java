package com.crm.mapper;

import org.apache.ibatis.annotations.Param;

public interface XmSequenceMapper {

	String getSequenceId(@Param("table") String table);

	void updateSeq(@Param("table") String table,@Param("seq")  int seq);

	int getMax(@Param("tablename") String tablename,@Param("key") String key);

}

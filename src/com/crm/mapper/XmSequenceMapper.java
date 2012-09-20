package com.crm.mapper;

import org.apache.ibatis.annotations.Param;

public interface XmSequenceMapper {

	int getSequenceId(@Param("table") String table);

	void updateSeq(@Param("table") String table,@Param("seq")  int seq);

}

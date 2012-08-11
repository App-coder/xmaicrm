package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ModuleMapper<T> {
	int getTotal(@Param("filter") String filter);
	List<T> loadList(@Param("start") int start,@Param("rows") int rows,@Param("filter") String filter);
}

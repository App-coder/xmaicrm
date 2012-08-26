package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface XmCampaignMapper{
	int getTotalBySql(@Param("filter") String filter);
	List<Object> loadListBySql(@Param("start") int start,@Param("rows") int rows,@Param("filter") String filter);
	String getMaxId();

}

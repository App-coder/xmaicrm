package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCampaign;

public interface XmCampaignMapper {
	int getTotalBySql(@Param("filter") String filter);
	List<Object> loadListBySql(@Param("start") int start,
			@Param("rows") int rows, @Param("filter") String filter);
	String getMaxId();
	int deleteByPrimaryKey(@Param("campaignid") Integer campaignid);
	int insert(XmCampaign record);
	int insertSelective(XmCampaign record);
	XmCampaign selectByPrimaryKey(Integer campaignid);
	int updateByPrimaryKeySelective(XmCampaign record);
	int updateByPrimaryKeyWithBLOBs(XmCampaign record);
	int updateByPrimaryKey(XmCampaign record);
	int deleteRecords(@Param("recordids") String recordids);
}

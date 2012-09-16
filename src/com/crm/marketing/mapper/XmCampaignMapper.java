package com.crm.marketing.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmCampaign;

public interface XmCampaignMapper extends ModuleMapper<XmCampaign> {
	int getTotalBySql(@Param("filter") String filter);
	List<Object> loadListBySql(@Param("start") int start,@Param("rows") int rows,@Param("filter") String filter);

}

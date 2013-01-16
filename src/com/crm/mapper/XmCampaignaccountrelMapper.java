package com.crm.mapper;

import com.crm.model.XmCampaignaccountrel;
import org.apache.ibatis.annotations.Param;

public interface XmCampaignaccountrelMapper {
    int deleteByPrimaryKey(@Param("accountid") Integer accountid, @Param("campaignid") Integer campaignid);

    int insert(XmCampaignaccountrel record);

    int insertSelective(XmCampaignaccountrel record);

	int deleteByAccounts(@Param("campaignid") int campaignid,@Param("selects") String selects);
}
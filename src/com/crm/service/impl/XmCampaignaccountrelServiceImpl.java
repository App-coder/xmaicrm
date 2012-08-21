package com.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCampaignaccountrelMapper;
import com.crm.model.XmCampaignaccountrel;
import com.crm.service.XmCampaignaccountrelService;

@Service("xmCampaignaccountrelService")
public class XmCampaignaccountrelServiceImpl
		implements
			XmCampaignaccountrelService {

	XmCampaignaccountrelMapper xmCampaignaccountrelMapper;
	@Resource(name="xmCampaignaccountrelMapper")
	public void setXmCampaignaccountrelMapper(
			XmCampaignaccountrelMapper xmCampaignaccountrelMapper) {
		this.xmCampaignaccountrelMapper = xmCampaignaccountrelMapper;
	}


	@Override
	public void insert(XmCampaignaccountrel rel) {
		this.xmCampaignaccountrelMapper.insert(rel);
	}


	@Override
	public int delete(int campaignid, String selects) {
		return this.xmCampaignaccountrelMapper.deleteByAccounts(campaignid, selects);
	}

}

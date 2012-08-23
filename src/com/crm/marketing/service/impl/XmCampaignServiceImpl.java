package com.crm.marketing.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.util.CvFilter;
import com.crm.marketing.mapper.XmCampaignMapper;
import com.crm.marketing.service.XmCampaignService;
import com.crm.model.XmCampaign;
@Service("xmCampaignService")
public class XmCampaignServiceImpl implements XmCampaignService {
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}
	
	XmCampaignMapper xmCampaignMapper;
	@Resource(name="xmCampaignMapper")
	public void setXmCampaignMapper(XmCampaignMapper xmCampaignMapper) {
		this.xmCampaignMapper = xmCampaignMapper;
	}

	public int getTotal(int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		return this.xmCampaignMapper.getTotal(filter);
	}

	@Override
	public List<XmCampaign> loadList(int page, int rows, int viewid) {
		String filter = this.cvFilter.getFilter(viewid);
		int start = (page-1)*rows;
		return this.xmCampaignMapper.loadList(start,rows,filter);
	}

}

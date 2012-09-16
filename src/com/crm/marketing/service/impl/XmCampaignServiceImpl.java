package com.crm.marketing.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.marketing.mapper.XmCampaignMapper;
import com.crm.marketing.service.XmCampaignService;
import com.crm.model.XmCampaign;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
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

	XmCustomviewMapper xmCustomviewMapper;
	@Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
	}
	
	public int getTotal(int viewid,XmCustomview customview,XmCvstdfilter stdfilter,List<XmCvadvfilter> advfilters,List<CVColumn> cols) {
		String totalsql = this.cvFilter.getTotalFilter(viewid,customview,stdfilter,advfilters,cols);
		return this.xmCampaignMapper.getTotalBySql(totalsql);
	}


	public List<Object> loadList(int page, int rows, int viewid,XmCustomview customview,XmCvstdfilter stdfilter,List<XmCvadvfilter> advfilters,List<CVColumn> cols) {
		String listsql = this.cvFilter.getListFilter(viewid,customview,stdfilter,advfilters,cols);
		int start = (page-1)*rows;
		return this.xmCampaignMapper.loadListBySql(start,rows,listsql);
	}



}

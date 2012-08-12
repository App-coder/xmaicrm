package com.crm.marketing.service;

import java.util.List;

import com.crm.bean.easyui.Column;
import com.crm.model.XmCampaign;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.service.ModuleService;

public interface XmCampaignService{
	public List<XmCampaign> loadList(int page, int rows, int viewid,XmCustomview customview,XmCvstdfilter stdfilter,List<XmCvadvfilter> advfilters,List<Column> cols) ;
	public int getTotal(int viewid,XmCustomview customview,XmCvstdfilter stdfilter,List<XmCvadvfilter> advfilters,List<Column> cols);
}


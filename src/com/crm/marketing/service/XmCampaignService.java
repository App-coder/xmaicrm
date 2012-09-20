package com.crm.marketing.service;

import java.util.HashMap;
import java.util.List;

import com.crm.bean.easyui.expand.CVColumn;
import com.crm.model.XmCampaign;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;

public interface XmCampaignService{
	public List<Object> loadList(int page, int rows, int viewid,XmCustomview customview,XmCvstdfilter stdfilter,List<XmCvadvfilter> advfilters,List<CVColumn> cols) ;
	public int getTotal(int viewid,XmCustomview customview,XmCvstdfilter stdfilter,List<XmCvadvfilter> advfilters,List<CVColumn> cols);
}


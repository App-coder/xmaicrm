package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.easyui.expand.CVColumn;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvadvfilterService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.service.XmCvstdfilterService;
import com.crm.service.portlets.KeyCustomviewService;

@Service("keyCustomviewService")
public class KeyCustomviewServiceImpl implements KeyCustomviewService {
	
	XmCustomviewMapper xmCustomviewMapper;
	@Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
	}
	
	XmCvstdfilterService xmCvstdfilterService;
	@Resource(name = "xmCvstdfilterService")
	public void setXmCvstdfilterService(
			XmCvstdfilterService xmCvstdfilterService) {
		this.xmCvstdfilterService = xmCvstdfilterService;
	}
	
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	XmCvcolumnlistService xmCvcolumnlistService;
	@Resource(name = "xmCvcolumnlistService")
	public void setXmCvcolumnlistService(
			XmCvcolumnlistService xmCvcolumnlistService) {
		this.xmCvcolumnlistService = xmCvcolumnlistService;
	}

	XmCvadvfilterService xmCvadvfilterService;
	@Resource(name = "xmCvadvfilterService")
	public void setXmCvadvfilterService(
			XmCvadvfilterService xmCvadvfilterService) {
		this.xmCvadvfilterService = xmCvadvfilterService;
	}

	@Override
	public List<XmCustomview> getKeyCustomviews() {
		List<XmCustomview> keyviews = this.xmCustomviewMapper.getKeyCustomview();
		return keyviews;
	}

	@Override
	public int getCountOfView(XmCustomview customview) {
		List<CVColumn> cols = this.xmCvcolumnlistService
				.getViewColumn(customview);
		XmCvstdfilter stdfilter = xmCvstdfilterService
				.getStdfilterByCvid(customview.getCvid());
		List<XmCvadvfilter> advfilter = xmCvadvfilterService
				.getAdvFilters(customview.getCvid());

		return this.xmCustomViewService.getTotal(customview.getCvid(), customview,
				stdfilter, advfilter, cols,"");
	}

	
}

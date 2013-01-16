package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmActivityMapper;
import com.crm.model.XmActivity;
import com.crm.service.XmActivityService;

@Component("com.crm.service.impl.xmActivityService")
public class XmActivityServiceImpl implements XmActivityService {
	
	XmActivityMapper xmActivityMapper;
	@Resource(name="xmActivityMapper")
	public void setXmActivityMapper(XmActivityMapper xmActivityMapper) {
		this.xmActivityMapper = xmActivityMapper;
	}

	@Override
	public int getTotalForGetActivities(int crmid) {
		return this.xmActivityMapper.getTotalForGetActivities(crmid);
	}

	@Override
	public List<XmActivity> getActivities(int page, int rows, int crmid) {
		int start = (page-1)*rows;
		return this.xmActivityMapper.getActivities(start,rows,crmid);
	}

}

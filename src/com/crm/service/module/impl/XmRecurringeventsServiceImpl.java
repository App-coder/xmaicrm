package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.XmRecurringeventsMapper;
import com.crm.model.XmRecurringevents;
import com.crm.service.XmSequenceService;
import com.crm.service.module.XmRecurringeventsService;
@Component("com.crm.service.module.impl.xmRecurringeventsService")
public class XmRecurringeventsServiceImpl implements XmRecurringeventsService {

	XmRecurringeventsMapper xmRecurringeventsMapper;
	@Resource(name="xmRecurringeventsMapper")
	public void setXmRecurringeventsMapper(
			XmRecurringeventsMapper xmRecurringeventsMapper) {
		this.xmRecurringeventsMapper = xmRecurringeventsMapper;
	}

	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	@Override
	public int insert(XmRecurringevents rec) {
		int key = this.xmSequenceService.getMaxAddOne("xm_recurringevents", "recurringid");
		rec.setRecurringid(key);
		this.xmRecurringeventsMapper.insert(rec);
		return key;
	}


	@Override
	public XmRecurringevents getById(int recurringid) {
		return this.xmRecurringeventsMapper.selectByPrimaryKey(recurringid);
	}

}

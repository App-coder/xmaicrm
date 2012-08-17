package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmActivityReminderMapper;
import com.crm.mapper.XmRecurringeventsMapper;
import com.crm.model.XmActivityReminder;
import com.crm.service.XmActivityReminderService;
import com.crm.service.XmSequenceService;

@Service("xmActivityReminderService")
public class XmActivityReminderServiceImpl implements XmActivityReminderService {

	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}

	XmRecurringeventsMapper xmRecurringeventsMapper;
	@Resource(name="xmRecurringeventsMapper")
	public void setXmRecurringeventsMapper(
			XmRecurringeventsMapper xmRecurringeventsMapper) {
		this.xmRecurringeventsMapper = xmRecurringeventsMapper;
	}

	XmActivityReminderMapper xmActivityReminderMapper;
	@Resource(name="xmActivityReminderMapper")
	public void setXmActivityReminderMapper(
			XmActivityReminderMapper xmActivityReminderMapper) {
		this.xmActivityReminderMapper = xmActivityReminderMapper;
	}


	@Override
	public List<XmActivityReminder> getActivityReminder(int recordid) {
		return this.xmActivityReminderMapper.getActivityReminder(recordid);
	}


	@Override
	public int insert(XmActivityReminder ar) {
		return this.xmActivityReminderMapper.insert(ar);
	}


	@Override
	public void clearReminder(int activityid) {
		this.xmActivityReminderMapper.clearActivityReminder(activityid);
		this.xmRecurringeventsMapper.clearRecurringevents(activityid);
	}

}

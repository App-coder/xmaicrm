package com.crm.service;

import java.util.List;

import com.crm.model.XmActivityReminder;

public interface XmActivityReminderService {

	List<XmActivityReminder> getActivityReminder(int recordid);

	int insert(XmActivityReminder ar);

	/**
	 * 添加操作前删除提醒
	 * 
	 * @param activityid
	 */
	void clearReminder(int activityid);

}

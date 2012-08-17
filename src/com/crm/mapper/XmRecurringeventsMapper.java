package com.crm.mapper;

import com.crm.model.XmRecurringevents;

public interface XmRecurringeventsMapper {
    int deleteByPrimaryKey(Integer recurringid);

    int insert(XmRecurringevents record);

    int insertSelective(XmRecurringevents record);

    XmRecurringevents selectByPrimaryKey(Integer recurringid);

    int updateByPrimaryKeySelective(XmRecurringevents record);

    int updateByPrimaryKey(XmRecurringevents record);

	void clearRecurringevents(int activityid);
}
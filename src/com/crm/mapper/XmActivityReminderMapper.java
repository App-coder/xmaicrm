package com.crm.mapper;

import java.util.List;

import com.crm.model.XmActivityReminder;
import org.apache.ibatis.annotations.Param;

public interface XmActivityReminderMapper {
    int deleteByPrimaryKey(@Param("activityId") Integer activityId, @Param("recurringid") Integer recurringid);

    int insert(XmActivityReminder record);

    int insertSelective(XmActivityReminder record);

    XmActivityReminder selectByPrimaryKey(@Param("activityId") Integer activityId, @Param("recurringid") Integer recurringid);

    int updateByPrimaryKeySelective(XmActivityReminder record);

    int updateByPrimaryKey(XmActivityReminder record);

	List<XmActivityReminder> getActivityReminder(@Param("activityId") Integer activityId);

	void clearActivityReminder(@Param("activityid") int activityid);
}
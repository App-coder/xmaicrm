package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmActivity;

public interface XmActivityMapper {
    int deleteByPrimaryKey(Integer activityid);

    int insert(XmActivity record);

    int insertSelective(XmActivity record);

    XmActivity selectByPrimaryKey(Integer activityid);

    int updateByPrimaryKeySelective(XmActivity record);

    int updateByPrimaryKeyWithBLOBs(XmActivity record);

    int updateByPrimaryKey(XmActivity record);

	List<XmActivity> getTopActivity(@Param("today") String today,@Param("dayend") String dayend,
		 @Param("smownerid") String smownerid);

	int getTotalForGetActivities(@Param("crmid") int crmid);

	List<XmActivity> getActivities(@Param("start") int start,@Param("rows") int rows,@Param("crmid") int crmid);

	List<XmActivity> getNotokcalendar(@Param("today") String today,@Param("userid") Integer userid);

	List<XmActivity> getTopCalendar(@Param("userid") String userid,@Param("now") String now,@Param("next") String next);

	/**
	 * 得到当天的日程
	 * 
	 * @param now
	 * @param tomorrow
	 * @return
	 */
	List<XmActivity> getDayActivity(@Param("now") String now,@Param("tomorrow") String tomorrow);

	/**
	 * 时间间隔内取事件
	 * 
	 * @param begin
	 * @param finish
	 * @return
	 */
	List<XmActivity> getActivitiesInInterval(@Param("begin") String begin,@Param("finish") String finish);

	String getMaxId();
}
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
}
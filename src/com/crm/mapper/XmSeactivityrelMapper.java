package com.crm.mapper;

import com.crm.model.XmSeactivityrel;
import org.apache.ibatis.annotations.Param;

public interface XmSeactivityrelMapper {
    int deleteByPrimaryKey(@Param("activityid") Integer activityid, @Param("crmid") Integer crmid);

    int insert(XmSeactivityrel record);

    int insertSelective(XmSeactivityrel record);

	XmSeactivityrel getRelAccount(@Param("recordid") int recordid);

	void deleteByActivityid(@Param("activityid") int activityid);
}
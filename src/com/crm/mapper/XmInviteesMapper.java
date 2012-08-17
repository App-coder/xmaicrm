package com.crm.mapper;

import java.util.List;

import com.crm.model.XmInvitees;
import org.apache.ibatis.annotations.Param;

public interface XmInviteesMapper {
    int deleteByPrimaryKey(@Param("activityid") Integer activityid, @Param("inviteeid") Integer inviteeid);

    int insert(XmInvitees record);

    int insertSelective(XmInvitees record);

	List<XmInvitees> getInvitees(@Param("recordid") int recordid);

	void clearInvitees(@Param("activityid") int activityid);
}
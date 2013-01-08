package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmAnnouncements;

public interface XmAnnouncementsMapper {
    int deleteByPrimaryKey(Integer announcementsid);

    int insert(XmAnnouncements record);

    int insertSelective(XmAnnouncements record);

    XmAnnouncements selectByPrimaryKey(Integer announcementsid);

    int updateByPrimaryKeySelective(XmAnnouncements record);

    int updateByPrimaryKeyWithBLOBs(XmAnnouncements record);

    int updateByPrimaryKey(XmAnnouncements record);

	List<XmAnnouncements> getAnnouncements(@Param("today") String today);
}
package com.crm.service.portlets.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.XmAnnouncementsMapper;
import com.crm.model.XmAnnouncements;
import com.crm.service.portlets.XmAnnouncementsService;
import com.crm.util.DateUtil;
@Component("com.crm.service.portlets.impl.xmAnnouncementsService")
public class XmAnnouncementsServiceImpl implements XmAnnouncementsService {
	
	XmAnnouncementsMapper xmAnnouncementsMapper;
	@Resource(name="xmAnnouncementsMapper")
	public void setXmAnnouncementsMapper(XmAnnouncementsMapper xmAnnouncementsMapper) {
		this.xmAnnouncementsMapper = xmAnnouncementsMapper;
	}


	@Override
	public List<XmAnnouncements> getAnnouncements() {
		String today = DateUtil.formatTime(new Date(), DateUtil.C_DATE_PATTON_DEFAULT);
		return this.xmAnnouncementsMapper.getAnnouncements(today);
	}

}

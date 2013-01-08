package com.crm.action.portlets;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.model.XmAnnouncement;
import com.crm.model.XmAnnouncements;
import com.crm.service.portlets.XmAnnouncementsService;
import com.crm.util.CacheUtil;
import com.crm.util.DateUtil;

import java.util.*;

/**
 * 
 * 公告
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 上午11:27:58
 */
@Controller
@RequestMapping(value = "crm/portlets/announcements")
public class AnnouncementsController {

	XmAnnouncementsService xmAnnouncementsService;
	@Resource(name="com.crm.service.portlets.impl.xmAnnouncementsService")
	public void setXmAnnouncementsService(
			XmAnnouncementsService xmAnnouncementsService) {
		this.xmAnnouncementsService = xmAnnouncementsService;
	}

	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson() {
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		List<XmAnnouncements> objs = this.xmAnnouncementsService.getAnnouncements();
		
		String aname = "";
		for(int i=0;i<objs.size();i++){
			if(objs.get(i).getAnnouncementname().length()>12){
				aname = objs.get(i).getAnnouncementname().substring(0,12)+"...";
				objs.get(i).setAnnouncement975(aname);
			}
		}
		
		String cachestr = JSON.toJSONStringWithDateFormat(objs,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		return cachestr;
	}
	
}

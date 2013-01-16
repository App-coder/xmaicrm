package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.model.XmActivity;
import com.crm.service.portlets.XmActivityService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/**
 * 
 * 过期未完成日程
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 下午4:42:09
 */
@Controller
@RequestMapping(value = "crm/portlets/notok_calendar")
@SessionAttributes(Constant.USERPERMISSION)
public class NotokcalendarController {
	
	XmActivityService xmActivityService;
	@Resource(name="com.crm.service.portlets.impl.xmActivityService")
	public void setXmActivityService(XmActivityService xmActivityService) {
		this.xmActivityService = xmActivityService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		List<XmActivity> treetags = this.xmActivityService.getNotokcalendar(userPermission.getUser().getId());
		
        String cachestr = JSON.toJSONStringWithDateFormat(treetags,DateUtil.C_DATE_PATTON_DEFAULT);
        CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		return cachestr;
	}
	
}

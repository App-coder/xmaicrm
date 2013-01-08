package com.crm.action.portlets;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.model.XmFreetags;
import com.crm.service.portlets.XmFreetagsService;
import com.crm.util.CacheUtil;
import com.crm.util.DateUtil;

import java.util.*;

import javax.annotation.Resource;

/**
 * 
 * 标签列表
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 下午3:49:54
 */
@Controller
@RequestMapping(value = "crm/portlets/free_tags")
public class FreetagsController {
	
	XmFreetagsService xmFreetagsService;
	@Resource(name="com.crm.service.portlets.impl.xmFreetagsService")
	public void setXmFreetagsService(XmFreetagsService xmFreetagsService) {
		this.xmFreetagsService = xmFreetagsService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		List<XmFreetags> tags = this.xmFreetagsService.getFreetags();

        String cachestr = JSON.toJSONStringWithDateFormat(tags,DateUtil.C_DATE_PATTON_DEFAULT);
        CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		return cachestr;
	}
	
}

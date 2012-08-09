package com.crm.action.portlets;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmGathers;
import com.crm.service.portlets.XmGathersService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

import java.util.*;

/**
 * 
 * 30天内及过期应收款
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 上午9:20:33
 */
@Controller
@RequestMapping(value = "crm/portlets/top_gather")
@SessionAttributes(Constant.USERPERMISSION)
public class TopGatherController {
	
	XmGathersService xmGathersService;
	@Resource(name="com.crm.service.portlets.impl.xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}

	/**
	 * 30天内及过期应收款
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmGathers> gathers = this.xmGathersService.getTopGather(userPermission.getUser().getId());
		bean.setRows(gathers);
		bean.setTotal(gathers.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr;
	}

}

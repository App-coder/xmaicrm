package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.model.XmMemdays;
import com.crm.service.portlets.XmMemdaysService;
import com.crm.util.CacheUtil;
import com.crm.util.DateUtil;

/**
 * 
 * 最近一个月客户纪念日
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 上午10:33:33
 */
@Controller
@RequestMapping(value = "crm/portlets/AccountMemdays")
public class AccountMemdaysController {
	
	XmMemdaysService xmMemdaysService;
	@Resource(name="com.crm.service.portlets.impl.xmMemdaysService")
	public void setXmMemdaysService(XmMemdaysService xmMemdaysService) {
		this.xmMemdaysService = xmMemdaysService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmMemdays> memdays = this.xmMemdaysService.getAccountMemdays();
		bean.setRows(memdays);
		bean.setTotal(memdays.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr; 
	}
	
}

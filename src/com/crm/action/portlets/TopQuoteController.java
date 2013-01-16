package com.crm.action.portlets;

import java.util.List;

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
import com.crm.model.XmQuotes;
import com.crm.service.portlets.XmQuotesService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/**
 * 最新报价
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 上午9:51:05
 */
@Controller
@RequestMapping(value = "crm/portlets/top_quote")
@SessionAttributes(Constant.USERPERMISSION)
public class TopQuoteController {
	
	XmQuotesService xmQuotesService;
	@Resource(name="com.crm.service.portlets.impl.xmQuotesService")
	public void setXmQuotesService(XmQuotesService xmQuotesService) {
		this.xmQuotesService = xmQuotesService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmQuotes> quotes = this.xmQuotesService.getTopQuote(userPermission.getUser().getId());
		bean.setRows(quotes);
		bean.setTotal(quotes.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr;
	}

	
}

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
import com.crm.model.XmQuotes;
import com.crm.model.XmSalesorder;
import com.crm.service.portlets.XmSalesorderService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/**
 * 
 * 最新已审批合同订单
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 上午10:00:32
 */
@Controller
@RequestMapping(value = "crm/portlets/top_salesorder")
@SessionAttributes(Constant.USERPERMISSION)
public class TopSalesorderController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="com.crm.service.portlets.impl.xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}


	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmSalesorder> orders = this.xmSalesorderService.getTopSalesorder(userPermission.getUser().getId());
		bean.setRows(orders);
		bean.setTotal(orders.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr;
	}
	
}

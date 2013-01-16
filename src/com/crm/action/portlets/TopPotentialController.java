package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmPotential;
import com.crm.service.module.XmPotentialService;
import com.crm.util.CacheUtil;
import com.crm.util.DateUtil;

/**
 * 金额较大的销售机会
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:42:07
 */
@Controller
@RequestMapping(value = "crm/portlets/top_potential")
public class TopPotentialController {

	XmPotentialService xmPotentialService;
	@Resource(name="xmPotentialService")
	public void setXmPotentialService(XmPotentialService xmPotentialService) {
		this.xmPotentialService = xmPotentialService;
	}

	@RequestMapping(value = "/index")
	public String index() {
		return "portlets/toppotential";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson() {
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		ListBean bean = new ListBean();
		List<XmPotential> potentials = this.xmPotentialService.getTopPotential();
		bean.setRows(potentials);
		bean.setTotal(potentials.size());
		
		String cachestr = JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		
		return cachestr;
	}
	
}

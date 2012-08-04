package com.crm.action.portlets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.portlets.AccountMoney;
import com.crm.model.XmGathers;
import com.crm.service.portlets.XmGathersService;
import com.crm.util.CacheUtil;

/**
 * 应收款客户,应付款客户汇总
 * 
 * User: zhujun Date: 2012-8-9 Time: 下午5:12:25
 */
@Controller
@RequestMapping(value = "crm/portlets/accountmoney")
public class AccountmoneyController {

	XmGathersService xmGathersService;
	@Resource(name = "com.crm.service.portlets.impl.xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/accountmoney";
	}

	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson() {
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		List<Object> objs = new ArrayList<Object>();
		// 应收款客户汇总
		List<XmGathers> gathers = this.xmGathersService.getGathersAll();
		BigDecimal gathersum = new BigDecimal(0);
		for (int i = 0; i < gathers.size(); i++) {
			gathersum = gathersum.add(gathers.get(i).getSumgathersplan());
		}
		AccountMoney am_gather = new AccountMoney(gathers.size(), gathersum);
		objs.add(am_gather);

		// 应付款客户汇总
		List<XmGathers> customercharge = this.xmGathersService
				.getCustomerCharge();
		BigDecimal customerchargesum = new BigDecimal(0);
		for (int i = 0; i < customercharge.size(); i++) {
			customerchargesum = customerchargesum.add(customercharge.get(i)
					.getSumchargesplan());
		}
		AccountMoney am_customercharge = new AccountMoney(
				customercharge.size(), customerchargesum);
		objs.add(am_customercharge);

		// 应付款供应商汇总
		List<XmGathers> suppliercharge = this.xmGathersService
				.getSupplierCharge();
		BigDecimal supplierchargesum = new BigDecimal(0);
		for (int i = 0; i < suppliercharge.size(); i++) {
			supplierchargesum = supplierchargesum.add(suppliercharge.get(i)
					.getSumchargesplan());
		}
		AccountMoney am_suppliercharge = new AccountMoney(
				suppliercharge.size(), supplierchargesum);
		objs.add(am_suppliercharge);
		
		String cachestr = JSON.toJSONString(objs);
		CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);
		return cachestr;
	}

}

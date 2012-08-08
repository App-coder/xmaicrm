package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmSalesorderService;

/**
 * 合同订单
 * 
 * User: zhujun
 * Date: 2012-8-1
 * Time: 下午4:32:00
 */
@Controller
@RequestMapping(value = "salesorder")
public class XmSalesorderController extends BaseController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}

	
}

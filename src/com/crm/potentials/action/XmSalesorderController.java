package com.crm.potentials.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.model.XmQuotes;
import com.crm.model.XmSalesorder;
import com.crm.potentials.service.XmSalesorderService;
import com.crm.service.XmCustomViewService;

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

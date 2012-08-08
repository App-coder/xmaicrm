package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmExpensesService;
/**
 * 费用报销
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午8:49:23
 */
@Controller
@RequestMapping(value = "expenses")
public class XmExpensesController extends BaseController {
	
	XmExpensesService xmExpensesService;
	@Resource(name="xmExpensesService")
	public void setXmExpensesService(XmExpensesService xmExpensesService) {
		this.xmExpensesService = xmExpensesService;
	}

}

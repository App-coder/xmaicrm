package com.crm.financial.action;

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
import com.crm.financial.service.XmExpensesService;
import com.crm.model.XmCustomview;
import com.crm.model.XmExpenses;
import com.crm.service.XmCustomViewService;
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

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
import com.crm.financial.service.XmChargesService;
import com.crm.model.XmCharges;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
/**
 * 应付款控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 上午12:04:08
 */
@Controller
@RequestMapping(value = "charges")
public class XmChargesController extends BaseController {
	
	XmChargesService xmChargesService;
	@Resource(name="xmChargesService")
	public void setXmChargesService(XmChargesService xmChargesService) {
		this.xmChargesService = xmChargesService;
	}

	
}

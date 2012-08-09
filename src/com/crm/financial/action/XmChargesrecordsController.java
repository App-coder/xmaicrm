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
import com.crm.financial.service.XmChargesrecordsService;
import com.crm.model.XmChargesrecords;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 付款单控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午8:49:58
 */
@Controller
@RequestMapping(value = "chargesrecords")
public class XmChargesrecordsController extends BaseController {
	
	XmChargesrecordsService xmChargesrecordsService;
	@Resource(name="xmChargesrecordsService")
	public void setXmChargesrecordsService(
			XmChargesrecordsService xmChargesrecordsService) {
		this.xmChargesrecordsService = xmChargesrecordsService;
	}
}

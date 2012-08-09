package com.crm.purchase.action;

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
import com.crm.model.XmVendor;
import com.crm.purchase.service.XmVendorService;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 供货商控制器
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午10:52:10
 */
@Controller
@RequestMapping(value = "vendor")
public class XmVendorController extends BaseController {
	
	XmVendorService xmVendorService;
	@Resource(name="xmVendorService")
	public void setXmVendorService(XmVendorService xmVendorService) {
		this.xmVendorService = xmVendorService;
	}

	
}

package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmVendorService;
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

package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmChargesService;
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

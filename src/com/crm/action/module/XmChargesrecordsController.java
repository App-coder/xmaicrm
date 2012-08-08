package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmChargesrecordsService;
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

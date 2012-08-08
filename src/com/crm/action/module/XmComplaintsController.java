package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmComplaintsService;
/**
 * 
 * 客户投诉
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午7:51:42
 */
@Controller
@RequestMapping(value = "complaints")
public class XmComplaintsController extends BaseController {
	
	XmComplaintsService xmComplaintsService;
	@Resource(name="xmComplaintsService")
	public void setXmComplaintsService(XmComplaintsService xmComplaintsService) {
		this.xmComplaintsService = xmComplaintsService;
	}

	
}

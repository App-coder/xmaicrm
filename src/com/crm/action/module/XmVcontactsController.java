package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmVcontactsService;

/**
 * 供货商联系人
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午11:00:30
 */
@Controller
@RequestMapping(value = "vcontacts")
public class XmVcontactsController extends BaseController {
	
	XmVcontactsService xmVcontactsService;
	@Resource(name="xmVcontactsService")
	public void setXmVcontactsService(XmVcontactsService xmVcontactsService) {
		this.xmVcontactsService = xmVcontactsService;
	}
}

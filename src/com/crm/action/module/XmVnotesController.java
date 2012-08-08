package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmVnotesService;

/**
 * 供应商联系记录
 * 
 * User: zhujun
 * Date: 2012-8-15
 * Time: 下午11:19:36
 */
@Controller
@RequestMapping(value = "vnotes")
public class XmVnotesController extends BaseController {
	
	XmVnotesService xmVnotesService;
	@Resource(name="xmVnotesService")
	public void setXmVnotesService(XmVnotesService xmVnotesService) {
		this.xmVnotesService = xmVnotesService;
	}

}

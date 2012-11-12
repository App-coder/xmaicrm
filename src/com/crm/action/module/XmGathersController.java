package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmGathersService;

/**
 * 应收款控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午2:37:01
 */
@Controller
@RequestMapping(value = "gathers")
public class XmGathersController extends BaseController {
	
	XmGathersService xmGathersService;
	@Resource(name="xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}

	
}

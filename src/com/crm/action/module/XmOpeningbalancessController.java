package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmOpeningbalancessService;
/**
 * 
 * 期初余额
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午9:28:31
 */
@Controller
@RequestMapping(value = "openingbalancess")
public class XmOpeningbalancessController extends BaseController {
	
	XmOpeningbalancessService xmOpeningbalancessService;
	@Resource(name="xmOpeningbalancessService")
	public void setXmOpeningbalancessService(
			XmOpeningbalancessService xmOpeningbalancessService) {
		this.xmOpeningbalancessService = xmOpeningbalancessService;
	}

	
}

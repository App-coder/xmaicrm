package com.crm.action.module;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.service.module.XmAccountrecordssService;
/**
 * 
 * 客户服务
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午7:41:16
 */
@Controller
@RequestMapping(value = "accountrecordss")
public class XmAccountrecordssController extends BaseController {
	
	XmAccountrecordssService xmAccountrecordssService;
	@Resource(name="xmAccountrecordssService")
	public void setXmAccountrecordssService(
			XmAccountrecordssService xmAccountrecordssService) {
		this.xmAccountrecordssService = xmAccountrecordssService;
	}


}

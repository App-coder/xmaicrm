package com.crm.afterser.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.afterser.service.XmAccountrecordssService;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmAccountrecordss;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
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

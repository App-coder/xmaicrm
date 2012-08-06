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
import com.crm.afterser.service.XmComplaintsService;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmComplaints;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
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

package com.crm.purchase.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.model.XmVcontacts;
import com.crm.purchase.service.XmVcontactsService;
import com.crm.service.XmCustomViewService;

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

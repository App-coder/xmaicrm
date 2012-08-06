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
import com.crm.model.XmVnotes;
import com.crm.purchase.service.XmVnotesService;
import com.crm.service.XmCustomViewService;

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

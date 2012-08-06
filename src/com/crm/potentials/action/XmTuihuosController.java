package com.crm.potentials.action;

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
import com.crm.model.XmSalesorder;
import com.crm.model.XmTuihuos;
import com.crm.potentials.service.XmTuihuosService;
import com.crm.service.XmCustomViewService;
@Controller
@RequestMapping(value = "tuihuos")
public class XmTuihuosController extends BaseController {
	
	XmTuihuosService xmTuihuosService;
	@Resource(name="xmTuihuosService")
	public void setXmTuihuosService(XmTuihuosService xmTuihuosService) {
		this.xmTuihuosService = xmTuihuosService;
	}
	
	
}

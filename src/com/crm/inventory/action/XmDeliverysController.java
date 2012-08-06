package com.crm.inventory.action;

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
import com.crm.inventory.service.XmDeliverysService;
import com.crm.model.XmCustomview;
import com.crm.model.XmDeliverys;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 出库单控制器
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午10:37:34
 */
@Controller
@RequestMapping(value = "deliverys")
public class XmDeliverysController extends BaseController {
	
	XmDeliverysService xmDeliverysService;
	@Resource(name="xmDeliverysService")
	public void setXmDeliverysService(XmDeliverysService xmDeliverysService) {
		this.xmDeliverysService = xmDeliverysService;
	}

}

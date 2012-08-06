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
import com.crm.inventory.service.XmWarehousesService;
import com.crm.model.XmCustomview;
import com.crm.model.XmPotential;
import com.crm.model.XmWarehouses;
import com.crm.service.XmCustomViewService;
/**
 * 
 * 入库单控制器
 * 
 * User: zhujun
 * Date: 2012-8-16
 * Time: 下午10:06:49
 */
@Controller
@RequestMapping(value = "warehouses")
public class XmWarehousesController extends BaseController {
	
	XmWarehousesService xmWarehousesService;
	@Resource(name="xmWarehousesService")
	public void setXmWarehousesService(XmWarehousesService xmWarehousesService) {
		this.xmWarehousesService = xmWarehousesService;
	}

}

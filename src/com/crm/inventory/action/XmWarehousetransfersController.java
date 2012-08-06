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
import com.crm.inventory.service.XmWarehousetransfersService;
import com.crm.model.XmCustomview;
import com.crm.model.XmWarehousetransfers;
import com.crm.service.XmCustomViewService;
/**
 * 库间调拨控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 上午12:04:08
 */
@Controller
@RequestMapping(value = "warehousetransfers")
public class XmWarehousetransfersController extends BaseController {
	
	XmWarehousetransfersService xmWarehousetransfersService;
	@Resource(name="xmWarehousetransfersService")
	public void setXmWarehousetransfersService(
			XmWarehousetransfersService xmWarehousetransfersService) {
		this.xmWarehousetransfersService = xmWarehousetransfersService;
	}
}

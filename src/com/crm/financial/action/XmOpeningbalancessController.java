package com.crm.financial.action;

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
import com.crm.financial.service.XmOpeningbalancessService;
import com.crm.model.XmChargesrecords;
import com.crm.model.XmCustomview;
import com.crm.model.XmOpeningbalancess;
import com.crm.service.XmCustomViewService;
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

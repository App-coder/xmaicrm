package com.crm.settings.system.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmField;
import com.crm.service.XmPicklistService;

/**
 * 
 * 系统设置-下拉框设置
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:40:08
 */
@Controller
@RequestMapping(value = "picklist")
public class XmPicklistController extends BaseController {
	@Autowired
	XmPicklistService xmPicklistService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/picklist";
	}
	
	
}

package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
/**
 * 
 * 收款单控制器
 * 
 * User: zhujun
 * Date: 2012-8-17
 * Time: 下午3:02:06
 */
@Controller
@RequestMapping(value = "crm/module/gathersrecords")
public class XmGathersrecordsController extends BaseController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle("Gathersrecords", ptb, modelMap, this.moduleUtil);

		return "module/gathersrecords/index";
	}
	
}

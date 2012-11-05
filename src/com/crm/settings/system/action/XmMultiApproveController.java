package com.crm.settings.system.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmApprove;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
import com.crm.settings.system.service.XmApproveService;
/**
 * 
 * 系统设置-审批流程
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/multiapprove")
public class XmMultiApproveController extends BaseController {
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}

	XmApproveService xmApproveService;
	@Resource(name="xmApproveService")
	public void setXmApproveService(XmApproveService xmApproveService) {
		this.xmApproveService = xmApproveService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmTab> modules = this.xmTabService.getMultiApproveModule();
		modelMap.addAttribute("modules",modules);
		
		return "settings/system/multiapprove";
	}
	
	
	/**
	 * @param tabid 
	 * @return
	 */
	@RequestMapping(value = "/getApproveList", method = RequestMethod.POST)
	@ResponseBody
	public String getApproveList(int tabid){
		
		ListBean bean = new ListBean();
		List<XmApprove> approves = this.xmApproveService.getApproveList(tabid); 
		bean.setRows(approves);
		bean.setTotal(approves.size());
		
		return JSON.toJSONString(approves);
	}
	
	
	
}

package com.crm.action.settings.basic;

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
import com.crm.model.XmLoginhistory;
import com.crm.model.XmUsers;
import com.crm.service.settings.basic.XmLoginhistoryService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.DateUtil;

/**
 * 
 * 基本设置-登入历史
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:21:44
 */
@Controller
@RequestMapping(value = "crm/settings/loginhistory")
public class XmLoginhistoryController extends BaseController {

	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}
	
	XmLoginhistoryService xmLoginhistoryService; 
	@Resource(name="xmLoginhistoryService")
	public void setXmLoginhistoryService(XmLoginhistoryService xmLoginhistoryService) {
		this.xmLoginhistoryService = xmLoginhistoryService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmUsers> users = this.xmUsersService.getActiveUser();
		modelMap.addAttribute("users",users);
		
		return "settings/basic/loginhistory";
	}
	
	@RequestMapping(value = "/loadHistory", method = RequestMethod.POST)
	@ResponseBody
	public String loadHistory(int page, int rows, String username){
		
		List<XmLoginhistory>  historys = this.xmLoginhistoryService.getHistoryByName(page,rows,username);
		int total = this.xmLoginhistoryService.getTotalByName(username);
		
		ListBean bean = new ListBean();
		bean.setRows(historys);
		bean.setTotal(total);
		
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
}

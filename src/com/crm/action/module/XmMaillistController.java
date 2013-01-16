package com.crm.action.module;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmMaillist;
import com.crm.model.XmQunfa;
import com.crm.service.module.XmMaillistService;
import com.crm.util.ActionUtil;

/**
 * 群发邮件
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午8:15:27
 */
@Controller
@RequestMapping(value = "crm/module/maillists")
public class XmMaillistController {
	
	XmMaillistService xmMaillistService;
	@Resource(name="xmMaillistService")
	public void setXmMaillistService(XmMaillistService xmMaillistService) {
		this.xmMaillistService = xmMaillistService;
	}

	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap,int ptb){
		
		ActionUtil.setTitle2("Maillists", ptb, modelMap, this.moduleUtil);
		
		return "module/maillist/index";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String maillists(@RequestParam("page") int page,@RequestParam("rows") int rows){
		ListBean bean = new ListBean();
		int total = this.xmMaillistService.getTotal();
		List<XmMaillist> maillist = this.xmMaillistService.getList(page,rows);
		bean.setRows(maillist);
		bean.setTotal(total);
		return JSON.toJSONString(bean);
	}
	
	
	
}

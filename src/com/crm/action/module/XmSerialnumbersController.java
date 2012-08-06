package com.crm.action.module;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ListBean;
import com.crm.service.module.XmSerialnumbersService;
import com.crm.util.ActionUtil;
import com.crm.util.DateUtil;

import java.util.*;

/**
 * 
 * 产品序列号
 * 
 * User: zhujun
 * Date: 2012-8-22
 * Time: 上午11:23:24
 */
@Controller
@RequestMapping(value = "crm/module/serialnumbers")
public class XmSerialnumbersController {
	
	XmSerialnumbersService xmSerialnumbersService;
	@Resource(name="xmSerialnumbersService")
	public void setXmSerialnumbersService(
			XmSerialnumbersService xmSerialnumbersService) {
		this.xmSerialnumbersService = xmSerialnumbersService;
	}

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb, ModelMap modelMap)
			throws UnsupportedEncodingException {

		ActionUtil.setTitle2("Serialnumbers", ptb, modelMap, this.moduleUtil);

		return "module/serialnumbers/index";
	}
	
	@RequestMapping(value = "/loadlist")
	@ResponseBody
	public String loadlist(int page,int rows,HttpServletRequest request){
		
		StringBuffer sb = new StringBuffer();
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		if(sort!=null){
			sb.append(" order by ");
			sb.append(sort+" ");
			sb.append(order+" ");
		}
		
		ListBean bean = new ListBean();
		int total = this.xmSerialnumbersService.getTotal();
		List<Object> list = this.xmSerialnumbersService.loadList(page,rows,sb.toString());
		bean.setTotal(total);
		bean.setRows(list);
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
	}
	
}

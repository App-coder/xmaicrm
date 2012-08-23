package com.crm.settings.other.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCurrencyInfo;
import com.crm.settings.other.service.XmCurrencyInfoService;
import com.crm.util.HtmlUtil;

/**
 * User: 货币币种 
 * Date: 2012-8-12
 * Time: 下午9:27:20
 */
@Controller
@RequestMapping(value = "settings/currencyInfo")
public class XmCurrencyInfoController {
	
	XmCurrencyInfoService xmCurrencyInfoService;
	@Resource(name="xmCurrencyInfoService")
	public void setXmCurrencyInfoService(XmCurrencyInfoService xmCurrencyInfoService) {
		this.xmCurrencyInfoService = xmCurrencyInfoService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		modelMap.addAttribute("asOptions",HtmlUtil.getActiveStatus());
		return "settings/other/currencyinfo";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(ModelMap modelMap){
		List<XmCurrencyInfo> list = this.xmCurrencyInfoService.getAll();
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return JSON.toJSONString(bean);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(XmCurrencyInfo currency){
		Message msg = new Message();
		msg.setType(true);
		if(currency.getId()!=null&&currency.getId()!=0){
			//修改
			this.xmCurrencyInfoService.update(currency);
			msg.setMessage("货币币种修改成功！");
		}else{
			this.xmCurrencyInfoService.insert(currency);
			msg.setMessage("货币币种添加成功！");
		}
		return JSON.toJSONString(msg);
	}
	
	
	
	@RequestMapping(value = "/getCurrencyById", method = RequestMethod.POST)
	@ResponseBody
	public String getCurrencyById(int cid){
		return JSON.toJSONString(this.xmCurrencyInfoService.getCurrencyById(cid));
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(@Param("cid") int cid){
		this.xmCurrencyInfoService.deleteById(cid);
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("货币币种删除成功！");
		return JSON.toJSONString(msg);
	}
	
}

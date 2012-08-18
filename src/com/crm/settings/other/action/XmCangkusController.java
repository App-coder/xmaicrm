package com.crm.settings.other.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ListBean;
import com.crm.settings.other.service.XmCangkusService;
@Controller
@RequestMapping(value = "settings/cangkus")
public class XmCangkusController {
	
	XmCangkusService xmCangkusService;
	@Resource(name="xmCangkusService")
	public void setXmCangkusService(XmCangkusService xmCangkusService) {
		this.xmCangkusService = xmCangkusService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/other/cangkus";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(){
		ListBean bean = new ListBean();
		List<Object> objects = this.xmCangkusService.getList();
		bean.setRows(objects);
		bean.setTotal(objects.size());
		return JSON.toJSONString(bean);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(int cangkusid){
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("仓库删除成功！");
		this.xmCangkusService.setStatus(cangkusid,0);
		return JSON.toJSONString(msg);
	}
	
}

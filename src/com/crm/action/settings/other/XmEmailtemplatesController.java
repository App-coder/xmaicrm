package com.crm.action.settings.other;

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
import com.crm.model.XmEmailtemplates;
import com.crm.service.settings.other.XmEmailtemplatesService;
import com.crm.util.HtmlEncoder;
/**
 * 
 * 其他设置-Email模版 
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/emailtemplates")
public class XmEmailtemplatesController extends BaseController {
	
	XmEmailtemplatesService xmEmailtemplatesService;
	@Resource(name="xmEmailtemplatesService")
	public void setXmEmailtemplatesService(
			XmEmailtemplatesService xmEmailtemplatesService) {
		this.xmEmailtemplatesService = xmEmailtemplatesService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/other/emailtemplates";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(ModelMap modelMap){
		List<XmEmailtemplates> list = this.xmEmailtemplatesService.getAll();
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);
		return JSON.toJSONString(bean);
	}
	
	@RequestMapping(value = "/showEdit", method = RequestMethod.GET)
	public String showEdit(int templateid,ModelMap modelmap){
		if(templateid!=-1){
			modelmap.addAttribute("pathname","编辑Email模版");
		}else{
			modelmap.addAttribute("pathname","添加Email模版");
		}
		return "settings/other/emailtemplates/showEdit";
	}
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show(int templateid,ModelMap modelmap) throws Exception{
		
		XmEmailtemplates templates = this.xmEmailtemplatesService.getById(templateid);
		templates.setBody(HtmlEncoder.toHtml(templates.getBody()));
		modelmap.addAttribute("templates",templates);
		
		return "settings/other/emailtemplates/show";
	}
	
	
}

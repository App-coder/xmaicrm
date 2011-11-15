package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.service.portlets.KeyCustomviewService;
/**
 * 
 * 关键视图
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:13:50
 */
@Controller
@RequestMapping(value = "crm/portlets/key_customview")
public class KeyCustomviewController {

	KeyCustomviewService keyCustomviewService;
	@Resource(name="keyCustomviewService")
	public void setKeyCustomviewService(KeyCustomviewService keyCustomviewService) {
		this.keyCustomviewService = keyCustomviewService;
	}


	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/keycustomview";
	}
	
	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(){
		ListBean bean = new ListBean();
		List<XmCustomview> keycustomviews = this.keyCustomviewService.getKeyCustomviews();
		for(int i=0;i<keycustomviews.size();i++){
			keycustomviews.get(i).setCountoflist(this.keyCustomviewService.getCountOfView(keycustomviews.get(i)));
		}
		bean.setRows(keycustomviews);
		bean.setTotal(keycustomviews.size());
		return JSON.toJSONString(bean); 
	}
	
}

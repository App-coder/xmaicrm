package com.crm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;

@Controller
@RequestMapping(value = "customize")
public class CustomViewController extends BaseController {
	
	XmCustomViewService xmCustomViewService;
    @Resource(name="xmCustomViewService")	
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}



	@RequestMapping(value = "/queryByEntityType", method = RequestMethod.GET)
	public String getViewList(@RequestParam("entitytype") String entitytype){
		List<XmCustomview> list=this.xmCustomViewService.queryByEntityType(entitytype);
		return this.arrayToJson(list);
	}
}

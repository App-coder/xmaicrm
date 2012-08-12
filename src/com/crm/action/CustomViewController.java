package com.crm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 获取视图的公共方法
     * @param entitytype
     * @return
     */
	@RequestMapping(value = "/queryByEntityType/{entitytype}", method = RequestMethod.GET)
	public String getViewList(@PathVariable String entitytype){
		List<XmCustomview> list=this.xmCustomViewService.queryByEntityType(entitytype);
		return this.arrayToJson(list);
	}
}

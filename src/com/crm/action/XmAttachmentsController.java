package com.crm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmAttachments;
import com.crm.service.XmAttachmentsService;

/**
 * 附件控制器
 * 
 * User: zhujun
 * Date: 2012-8-18
 * Time: 下午9:59:55
 */
@Controller
@RequestMapping(value = "crm/attachments")
public class XmAttachmentsController {
	
	XmAttachmentsService xmAttachmentsService;
	@Resource(name="xmAttachmentsService")
	public void setXmAttachmentsService(XmAttachmentsService xmAttachmentsService) {
		this.xmAttachmentsService = xmAttachmentsService;
	}

	@RequestMapping(value = "/getRelAttachments", method = RequestMethod.POST)
	@ResponseBody
	public String getRelAttachments(String module,Integer crmid){
		
		ListBean bean = new ListBean();
		List<XmAttachments> attachments = this.xmAttachmentsService.getRelAttachments(module,crmid);
		
		bean.setRows(attachments);
		bean.setTotal(attachments.size());
		
		return JSON.toJSONString(bean);
	}


}

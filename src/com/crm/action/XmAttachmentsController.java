package com.crm.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.Message;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmAttachments;
import com.crm.model.XmSeattachmentsrel;
import com.crm.service.XmAttachmentsService;
import com.crm.service.XmSeattachmentsrelService;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/**
 * 附件控制器
 * 
 * User: zhujun
 * Date: 2012-8-18
 * Time: 下午9:59:55
 */
@Controller
@RequestMapping(value = "crm/attachments")
@SessionAttributes({Constant.USERPERMISSION})
public class XmAttachmentsController {
	
	XmAttachmentsService xmAttachmentsService;
	@Resource(name="xmAttachmentsService")
	public void setXmAttachmentsService(XmAttachmentsService xmAttachmentsService) {
		this.xmAttachmentsService = xmAttachmentsService;
	}
	
	XmSeattachmentsrelService xmSeattachmentsrelService;
	@Resource(name="xmSeattachmentsrelService")
	public void setXmSeattachmentsrelService(
			XmSeattachmentsrelService xmSeattachmentsrelService) {
		this.xmSeattachmentsrelService = xmSeattachmentsrelService;
	}

	@RequestMapping(value = "/getRelAttachments", method = RequestMethod.POST)
	@ResponseBody
	public String getRelAttachments(int page,int rows,String module,Integer crmid){
		
		ListBean bean = new ListBean();
		int total = this.xmAttachmentsService.getTotalRelAttachments(module,crmid);
		List<XmAttachments> attachments = this.xmAttachmentsService.getRelAttachments(module,crmid,page,rows);
		
		bean.setRows(attachments);
		bean.setTotal(total);
		
		return JSON.toJSONStringWithDateFormat(bean, DateUtil.C_DATE_PATTON_DEFAULT);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String add(String description,String path,String type,String name,String module,Integer crmid,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		XmAttachments attach = new XmAttachments();
		attach.setCreatedtime(new Date());
		attach.setDeleted(0);
		attach.setDescription(description);
		attach.setName(name);
		attach.setPath(path);
		attach.setSetype(module);
		attach.setType(type);
		attach.setSmcreatorid(userPermission.getUser().getId());

		int attachid = this.xmAttachmentsService.insert(attach);
		
		XmSeattachmentsrel rel = new XmSeattachmentsrel();
		rel.setAttachmentsid(attachid);
		rel.setCrmid(crmid);
		this.xmSeattachmentsrelService.insert(rel);
		
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("附件添加成功！");
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(Integer attachmentid){
		
		this.xmAttachmentsService.deleteById(attachmentid);
		
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("附件删除成功！");
		return JSON.toJSONString(msg);
	}

}

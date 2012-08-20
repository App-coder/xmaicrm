package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmAttachmentsMapper;
import com.crm.model.XmAttachments;
import com.crm.service.XmAttachmentsService;
import com.crm.service.XmSequenceService;

@Service("xmAttachmentsService")
public class XmAttachmentsServiceImpl implements XmAttachmentsService {
	
	XmAttachmentsMapper xmAttachmentsMapper;
	@Resource(name="xmAttachmentsMapper")
	public void setXmAttachmentsMapper(XmAttachmentsMapper xmAttachmentsMapper) {
		this.xmAttachmentsMapper = xmAttachmentsMapper;
	}
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	@Override
	public List<XmAttachments> getRelAttachments(String module, Integer crmid) {
		return this.xmAttachmentsMapper.getRelAttachments(module,crmid);
	}


	@Override
	public int insert(XmAttachments attach) {
		int seq = this.xmSequenceService.getMaxAddOne("xm_attachments", "attachmentsid");
		attach.setAttachmentsid(seq);
		this.xmAttachmentsMapper.insert(attach);
		return seq;
	}


	@Override
	public void deleteById(Integer attachmentid) {
		XmAttachments attach = new XmAttachments();
		attach.setAttachmentsid(attachmentid);
		attach.setDeleted(1);
		this.xmAttachmentsMapper.updateByPrimaryKeySelective(attach);
	}
	
}

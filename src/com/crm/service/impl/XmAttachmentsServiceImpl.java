package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmAttachmentsMapper;
import com.crm.model.XmAttachments;
import com.crm.service.XmAttachmentsService;

@Service("xmAttachmentsService")
public class XmAttachmentsServiceImpl implements XmAttachmentsService {
	
	XmAttachmentsMapper xmAttachmentsMapper;
	@Resource(name="xmAttachmentsMapper")
	public void setXmAttachmentsMapper(XmAttachmentsMapper xmAttachmentsMapper) {
		this.xmAttachmentsMapper = xmAttachmentsMapper;
	}


	@Override
	public List<XmAttachments> getRelAttachments(String module, Integer crmid) {
		return this.xmAttachmentsMapper.getRelAttachments(module,crmid);
	}
	
}

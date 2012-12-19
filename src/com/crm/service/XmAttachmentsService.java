package com.crm.service;

import java.util.List;

import com.crm.model.XmAttachments;

public interface XmAttachmentsService {

	List<XmAttachments> getRelAttachments(String module, Integer crmid);

}

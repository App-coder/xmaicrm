package com.crm.service;

import java.util.List;

import com.crm.model.XmAttachments;

public interface XmAttachmentsService {

	List<XmAttachments> getRelAttachments(String module, Integer crmid, int page, int rows);

	int insert(XmAttachments attach);

	void deleteById(Integer attachmentid);

	int getTotalRelAttachments(String module, Integer crmid);

}

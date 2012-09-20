package com.crm.service;

import java.util.List;

import com.crm.model.XmBlocks;

public interface XmBlocksService {
	public List<XmBlocks> getBlocksByTabId(int tabid);
}

package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmBlocksMapper;
import com.crm.model.XmBlocks;
import com.crm.service.XmBlocksService;

@Service("xmBlocksService")
public class XmBlocksServiceImpl implements XmBlocksService {
	
	XmBlocksMapper xmBlocksMapper;
	@Resource(name="xmBlocksMapper")
	public void setXmBlocksMapper(XmBlocksMapper xmBlocksMapper) {
		this.xmBlocksMapper = xmBlocksMapper;
	}


	@Override
	public List<XmBlocks> getBlocksByTabId(int tabid) {
		return this.xmBlocksMapper.getBlocksByTabId(tabid);
	}


	@Override
	public List<XmBlocks> getFieldBlocksByTabId(Integer tabid) {
		return this.xmBlocksMapper.getFieldBlocksByTabId(tabid);
	}

}

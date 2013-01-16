package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.XmFreetagsMapper;
import com.crm.model.XmFreetags;
import com.crm.service.portlets.XmFreetagsService;

@Component("com.crm.service.portlets.impl.xmFreetagsService")
public class XmFreetagsServiceImpl implements XmFreetagsService{
	
	XmFreetagsMapper xmFreetagsMapper; 
	@Resource(name="xmFreetagsMapper")
	public void setXmFreetagsMapper(XmFreetagsMapper xmFreetagsMapper) {
		this.xmFreetagsMapper = xmFreetagsMapper;
	}


	@Override
	public List<XmFreetags> getFreetags() {
		return this.xmFreetagsMapper.getFreetags();
	}

}

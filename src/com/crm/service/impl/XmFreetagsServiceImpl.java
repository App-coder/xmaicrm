package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmFreetagsMapper;
import com.crm.model.XmFreetags;
import com.crm.service.XmFreetagsService;
@Service("xmFreetagsService")
public class XmFreetagsServiceImpl implements XmFreetagsService{
	
	XmFreetagsMapper xmFreetagsMapper;
	@Resource(name="xmFreetagsMapper")
	public void setXmFreetagsMapper(XmFreetagsMapper xmFreetagsMapper) {
		this.xmFreetagsMapper = xmFreetagsMapper;
	}


	@Override
	public List<XmFreetags> getModuleTags(String module, int recordid) {
		return this.xmFreetagsMapper.getModuleTags(module,recordid);
	}

}

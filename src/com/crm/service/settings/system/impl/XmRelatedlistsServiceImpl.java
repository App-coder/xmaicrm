package com.crm.service.settings.system.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.system.XmRelatedlistsMapper;
import com.crm.model.XmRelatedlists;
import com.crm.service.settings.system.XmRelatedlistsService;
@Service("xmRelatedlistsService")
public class XmRelatedlistsServiceImpl implements XmRelatedlistsService {

	XmRelatedlistsMapper xmRelatedlistsMapper;
	@Resource(name="xmRelatedlistsMapper")
	public void setXmRelatedlistsMapper(XmRelatedlistsMapper xmRelatedlistsMapper) {
		this.xmRelatedlistsMapper = xmRelatedlistsMapper;
	}


	@Override
	public List<XmRelatedlists> getRelatedByTabid(int tabid) {
		return this.xmRelatedlistsMapper.getRelatedByTabid(tabid);
	}

}

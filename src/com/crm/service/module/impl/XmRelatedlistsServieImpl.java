package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.system.XmRelatedlistsMapper;
import com.crm.model.XmRelatedlists;
import com.crm.service.module.XmRelatedlistsServie;
@Service("xmRelatedlistsServie")
public class XmRelatedlistsServieImpl implements XmRelatedlistsServie {

	XmRelatedlistsMapper xmRelatedlistsMapper;
	@Resource(name="xmRelatedlistsMapper")
	public void setXmRelatedlistsMapper(XmRelatedlistsMapper xmRelatedlistsMapper) {
		this.xmRelatedlistsMapper = xmRelatedlistsMapper;
	}


	@Override
	public List<XmRelatedlists> getRelatedlistByTabid(Integer tabid) {
		return this.xmRelatedlistsMapper.getRelatedlistByTabid(tabid);
	}

}

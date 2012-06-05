package com.crm.service.settings.other.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.other.XmEmailtemplatesMapper;
import com.crm.model.XmEmailtemplates;
import com.crm.service.settings.other.XmEmailtemplatesService;

@Service("xmEmailtemplatesService")
public class XmEmailtemplatesServiceImpl implements XmEmailtemplatesService {
	
	XmEmailtemplatesMapper xmEmailtemplatesMapper;
	@Resource(name="xmEmailtemplatesMapper")
	public void setXmEmailtemplatesMapper(
			XmEmailtemplatesMapper xmEmailtemplatesMapper) {
		this.xmEmailtemplatesMapper = xmEmailtemplatesMapper;
	}


	@Override
	public List<XmEmailtemplates> getAll() {
		return this.xmEmailtemplatesMapper.getAll();
	}

}

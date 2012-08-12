package com.crm.settings.other.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmEmailtemplates;
import com.crm.settings.other.mapper.XmEmailtemplatesMapper;
import com.crm.settings.other.service.XmEmailtemplatesService;

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

package com.crm.service.settings.basic.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.basic.XmDefOrgShareMapper;
import com.crm.service.settings.basic.XmDefOrgShareService;

@Service("xmDefOrgShareService")
public class XmDefOrgShareServiceImpl implements XmDefOrgShareService {

	XmDefOrgShareMapper xmDefOrgShareMapper;
	@Resource(name="xmDefOrgShareMapper")
	public void setXmDefOrgShareMapper(XmDefOrgShareMapper xmDefOrgShareMapper) {
		this.xmDefOrgShareMapper = xmDefOrgShareMapper;
	}


	@Override
	public List<Object> getShareRules() {
		return this.xmDefOrgShareMapper.getShareRules() ;
	}

}

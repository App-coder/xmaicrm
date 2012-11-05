package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.settings.basic.mapper.XmDefOrgShareMapper;
import com.crm.settings.basic.service.XmDefOrgShareService;

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

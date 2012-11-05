package com.crm.service.settings.other.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.settings.other.XmOrganizationdetailsMapper;
import com.crm.model.XmOrganizationdetails;
import com.crm.service.settings.other.XmOrganizationdetailsService;
@Service("xmOrganizationdetailsService")
public class XmOrganizationdetailsServiceImpl
		implements
			XmOrganizationdetailsService {
	
	XmOrganizationdetailsMapper xmOrganizationdetailsMapper;
	@Resource(name="xmOrganizationdetailsMapper")
	public void setXmOrganizationdetailsMapper(
			XmOrganizationdetailsMapper xmOrganizationdetailsMapper) {
		this.xmOrganizationdetailsMapper = xmOrganizationdetailsMapper;
	}


	@Override
	public XmOrganizationdetails getDetails() {
		return this.xmOrganizationdetailsMapper.getDetails();
	}


	@Override
	public void update(XmOrganizationdetails details) {
		this.xmOrganizationdetailsMapper.update(details);
	}

}

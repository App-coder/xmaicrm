package com.crm.settings.other.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmOrganizationdetails;
import com.crm.settings.other.mapper.XmOrganizationdetailsMapper;
import com.crm.settings.other.service.XmOrganizationdetailsService;
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

}

package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmContactdetailsMapper;
import com.crm.model.XmContactdetails;
import com.crm.service.XmContactdetailsService;
@Service("xmContactdetailsService")
public class XmContactdetailsServiceImpl implements XmContactdetailsService {
	
	XmContactdetailsMapper xmContactdetailsMapper;
	@Resource(name="xmContactdetailsMapper")
	public void setXmContactdetailsMapper(
			XmContactdetailsMapper xmContactdetailsMapper) {
		this.xmContactdetailsMapper = xmContactdetailsMapper;
	}

	@Override
	public int getTotalForGetContacts(int campaignid) {
		return this.xmContactdetailsMapper.getTotalForGetContacts(campaignid);
	}

	@Override
	public List<XmContactdetails> getContactdetails(int page, int rows,
			int campaignid) {
		int start = (page-1)*rows;
		return this.xmContactdetailsMapper.getContactdetails(start,rows,campaignid);
	}

	@Override
	public List<XmContactdetails> getContactdetailsByAccountid(String accountid) {
		return this.xmContactdetailsMapper.getContactdetailsByAccountid(accountid);
	}

}

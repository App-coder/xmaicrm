package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmContactService;
import com.crm.customer.mapper.XmContactdetailsMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmContactService")
public class XmContactServiceImpl implements XmContactService {
	
	XmContactdetailsMapper xmContactdetailsMapper;
    @Resource(name="xmContactdetailsMapper")
	public void setXmContactdetailsMapper(XmContactdetailsMapper xmContactdetailsMapper) {
    	this.xmContactdetailsMapper = xmContactdetailsMapper;
	}
    

}

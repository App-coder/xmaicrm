package com.crm.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.crm.customer.service.XmNoteService;
import com.crm.customer.mapper.XmNotesMapper;
import com.crm.mapper.util.CvFilter;

@Service("xmNoteService")
public class XmNoteServiceImpl implements XmNoteService {
	
	XmNotesMapper xmNotesMapper;
    @Resource(name="xmNotesMapper")
	public void setXmNotesMapper(XmNotesMapper xmNotesMapper) {
    	this.xmNotesMapper = xmNotesMapper;
	}
    

}

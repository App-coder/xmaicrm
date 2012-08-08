package com.crm.service.module.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmNotesMapper;
import com.crm.service.module.XmNoteService;

@Service("xmNoteService")
public class XmNoteServiceImpl implements XmNoteService {
	
	XmNotesMapper xmNotesMapper;
    @Resource(name="xmNotesMapper")
	public void setXmNotesMapper(XmNotesMapper xmNotesMapper) {
    	this.xmNotesMapper = xmNotesMapper;
	}
    

}

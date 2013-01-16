package com.crm.service.portlets.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmNotesMapper;
import com.crm.model.XmNotes;
import com.crm.service.portlets.XmNotesService;

@Component("com.crm.service.portlets.impl.xmNotesService")
public class XmNotesServiceImpl implements XmNotesService {

	XmNotesMapper xmNotesMapper;
	@Resource(name="xmNotesMapper")
	public void setXmNotesMapper(XmNotesMapper xmNotesMapper) {
		this.xmNotesMapper = xmNotesMapper;
	}


	@Override
	public List<XmNotes> getTopNotes(Integer userid) {
		return this.xmNotesMapper.getTopNotes(userid);
	}

}

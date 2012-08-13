package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmFieldMapper;
import com.crm.mapper.XmTabMapper;
import com.crm.model.XmField;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;
@Service("xmFieldService")
public class XmFieldServiceImpl implements XmFieldService{

	XmFieldMapper xmFieldMapper;
	@Resource(name="xmFieldMapper")
	public void setXmFieldMapper(XmFieldMapper xmFieldMapper) {
		this.xmFieldMapper = xmFieldMapper;
	}
	
	XmTabMapper xmTabMapper;
	@Resource(name="xmTabMapper")
	public void setXmTabMapper(XmTabMapper xmTabMapper) {
		this.xmTabMapper = xmTabMapper;
	}

	public List<XmField> getReportField(String tabname) {
		XmTab tab = this.xmTabMapper.getTabByName(tabname);
		List<XmField> fields = this.xmFieldMapper.getReportField(tab.getTabid());
		return fields;
	}

}

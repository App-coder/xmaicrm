package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmDefOrgFieldMapper;
import com.crm.model.XmDefOrgField;
import com.crm.service.XmDefOrgFieldService;

@Service("xmDefOrgFieldService")
public class XmDefOrgFieldServiceImpl implements XmDefOrgFieldService {
	
	XmDefOrgFieldMapper xmDefOrgFieldMapper;
	@Resource(name="xmDefOrgFieldMapper")
	public void setXmDefOrgFieldMapper(XmDefOrgFieldMapper xmDefOrgFieldMapper) {
		this.xmDefOrgFieldMapper = xmDefOrgFieldMapper;
	}


	@Override
	public List<XmDefOrgField> selectAll() {
		return this.xmDefOrgFieldMapper.selectAll();
	}

}

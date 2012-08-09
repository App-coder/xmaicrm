package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmEntitynameMapper;
import com.crm.model.XmEntityname;
import com.crm.service.XmEntitynameService;
@Service("xmEntitynameService")
public class XmEntitynameServiceImpl implements XmEntitynameService {
	
	XmEntitynameMapper xmEntitynameMapper;
	@Resource(name="xmEntitynameMapper")
	public void setXmEntitynameMapper(XmEntitynameMapper xmEntitynameMapper) {
		this.xmEntitynameMapper = xmEntitynameMapper;
	}


	@Override
	public List<XmEntityname> getEntityname() {
		return this.xmEntitynameMapper.getEntityname();
	}


	@Override
	public XmEntityname getEntityByModule(String module) {
		return this.xmEntitynameMapper.getEntityByModule(module);
	}

}

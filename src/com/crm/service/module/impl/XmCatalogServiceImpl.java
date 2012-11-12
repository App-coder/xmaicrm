package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmCatalogMapper;
import com.crm.model.XmCatalog;
import com.crm.service.module.XmCatalogService;

@Service("xmCatalogService")
public class XmCatalogServiceImpl implements XmCatalogService {

	XmCatalogMapper xmCatalogMapper;
	@Resource(name="xmCatalogMapper")
	public void setXmCatalogMapper(XmCatalogMapper xmCatalogMapper) {
		this.xmCatalogMapper = xmCatalogMapper;
	}


	public List<XmCatalog> getCatalogById(String parentid) {
		return this.xmCatalogMapper.getCatalogById(parentid);
	}

}

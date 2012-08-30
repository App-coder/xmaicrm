package com.crm.product.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmCatalog;
import com.crm.product.mapper.XmCatalogMapper;
import com.crm.product.service.XmCatalogService;

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

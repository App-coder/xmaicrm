package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmCatalogMapper;
import com.crm.model.XmCatalog;
import com.crm.service.XmSequenceService;
import com.crm.service.module.XmCatalogService;

@Service("xmCatalogService")
public class XmCatalogServiceImpl implements XmCatalogService {

	XmCatalogMapper xmCatalogMapper;
	@Resource(name="xmCatalogMapper")
	public void setXmCatalogMapper(XmCatalogMapper xmCatalogMapper) {
		this.xmCatalogMapper = xmCatalogMapper;
	}

	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	public List<XmCatalog> getCatalogById(String parentid) {
		return this.xmCatalogMapper.getCatalogById(parentid);
	}


	@Override
	public void insert(XmCatalog catalog) {
		int seq = this.xmSequenceService.getSequenceId("catalog");
		catalog.setCatalogid("H"+seq);
		catalog.setParentcatalog(catalog.getParentcatalog()+"::"+"H"+seq);
		this.xmCatalogMapper.insert(catalog);
	}


	@Override
	public void edit(XmCatalog catalog) {
		catalog.setParentcatalog(catalog.getParentcatalog()+"::"+catalog.getCatalogid());
		this.xmCatalogMapper.updateByPrimaryKey(catalog);
	}


	@Override
	public void delete(String cid) {
		this.xmCatalogMapper.deleteByPrimaryKey(cid);
	}


	@Override
	public List<XmCatalog> getCatalogAll() {
		return this.xmCatalogMapper.getCatalogAll();
	}

}

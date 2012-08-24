package com.crm.settings.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmParenttab;
import com.crm.service.XmSequenceService;
import com.crm.settings.system.mapper.XmParenttabMapper;
import com.crm.settings.system.service.XmParenttabService;

@Service("xmParenttabService")
public class XmParenttabServiceImpl implements XmParenttabService {
	
	XmParenttabMapper xmParenttabMapper;
	@Resource(name="xmParenttabMapper")
	public void setXmParenttabMapper(XmParenttabMapper xmParenttabMapper) {
		this.xmParenttabMapper = xmParenttabMapper;
	}
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	@Override
	public List<XmParenttab> getAll() {
		return this.xmParenttabMapper.getAll();
	}


	@Override
	public XmParenttab getParenttab(int id) {
		return this.xmParenttabMapper.selectByPrimaryKey(id);
	}


	@Override
	public int insertParenttab(XmParenttab parenttab) {
		int keyid = this.xmSequenceService.getMaxAddOne("xm_parenttab", "parenttabid");
		parenttab.setParenttabid(keyid);
		this.xmParenttabMapper.insert(parenttab);
		return keyid;
	}


	@Override
	public void update(XmParenttab parenttab) {
		this.xmParenttabMapper.updateByPrimaryKey(parenttab);
	}


	@Override
	public void deleteById(int parenttabid) {
		this.xmParenttabMapper.deleteByPrimaryKey(parenttabid);
	}


	@Override
	public List<XmParenttab> getVisibleParenttab() {
		return this.xmParenttabMapper.getVisibleParenttab();
	}

}

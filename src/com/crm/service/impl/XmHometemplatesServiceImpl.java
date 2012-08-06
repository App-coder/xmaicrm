package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmHometemplatesMapper;
import com.crm.mapper.XmSequenceMapper;
import com.crm.model.XmHometemplates;
import com.crm.service.XmHometemplatesService;
import com.crm.service.XmSequenceService;

@Service("xmHometemplatesService")
public class XmHometemplatesServiceImpl implements XmHometemplatesService {

	XmHometemplatesMapper xmHometemplatesMapper;
	@Resource(name="xmHometemplatesMapper")
	public void setXmHometemplatesMapper(XmHometemplatesMapper xmHometemplatesMapper) {
		this.xmHometemplatesMapper = xmHometemplatesMapper;
	}
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}

	@Override
	public int getTotal() {
		return this.xmHometemplatesMapper.getTotal();
	}

	@Override
	public List<XmHometemplates> loadlist(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmHometemplatesMapper.loadlist(start,rows);
	}

	@Override
	public XmHometemplates getById(int hometemplatesid) {
		return this.xmHometemplatesMapper.getById(hometemplatesid);
	}

	@Override
	public int update(XmHometemplates template) {
		return this.xmHometemplatesMapper.updateByPrimaryKeySelective(template);
	}

	@Override
	public int insert(XmHometemplates template) {
		int key = xmSequenceService.getSequenceId("hometemplates");
		template.setHometemplatesid(key);
		this.xmHometemplatesMapper.insert(template);
		return key;
	}

	@Override
	public int deleteById(int hometemplatesid) {
		return this.xmHometemplatesMapper.deleteByPrimaryKey(hometemplatesid);
	}

}

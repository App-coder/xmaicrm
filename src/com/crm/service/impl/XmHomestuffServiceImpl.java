package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmHomestuffMapper;
import com.crm.mapper.XmHometemplatesMapper;
import com.crm.model.XmHomestuff;
import com.crm.service.XmHomestuffService;
import com.crm.service.XmSequenceService;

@Service("xmHomestuffService")
public class XmHomestuffServiceImpl implements XmHomestuffService {
	
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

	XmHomestuffMapper xmHomestuffMapper;
	@Resource(name="xmHomestuffMapper")
	public void setXmHomestuffMapper(XmHomestuffMapper xmHomestuffMapper) {
		this.xmHomestuffMapper = xmHomestuffMapper;
	}

	@Override
	public List<XmHomestuff> getStuffByRole(String role) {
		String templatesid = this.xmHometemplatesMapper.getStuffId(role);
		int hometemplatesid = 0;
		if(templatesid!=null&&templatesid!=""){
			hometemplatesid = Integer.parseInt(templatesid);
		}
		List<XmHomestuff> stuffs = null;
		
		if(hometemplatesid!=0){
			 stuffs = this.xmHomestuffMapper.getStuffById(hometemplatesid);
		}else{
			//默认的视图模版
			stuffs = this.xmHomestuffMapper.getDefaultStuff();
		}
		return stuffs;
	}

	@Override
	public List<XmHomestuff> getByStuffId(int hometemplatesid) {
		return this.xmHomestuffMapper.getByStuffId(hometemplatesid);
	}

	@Override
	public void insert(XmHomestuff xmHomestuff) {
		this.xmHomestuffMapper.insert(xmHomestuff);
	}

	@Override
	public int deleteByStuffId(int hometemplatesid) {
		return this.xmHomestuffMapper.deleteByStuffId(hometemplatesid);
	}

	@Override
	public int changeSeq(XmHomestuff xmHomestuff) {
		return this.xmHomestuffMapper.changeSeq(xmHomestuff);
	}

	
	
}

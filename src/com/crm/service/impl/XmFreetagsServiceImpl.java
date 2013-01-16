package com.crm.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmFreetaggedObjectsMapper;
import com.crm.mapper.XmFreetagsMapper;
import com.crm.model.XmFreetaggedObjects;
import com.crm.model.XmFreetags;
import com.crm.service.XmFreetagsService;
import com.crm.service.XmSequenceService;
import com.crm.util.DateUtil;
@Service("xmFreetagsService")
public class XmFreetagsServiceImpl implements XmFreetagsService{
	
	XmFreetagsMapper xmFreetagsMapper;
	@Resource(name="xmFreetagsMapper")
	public void setXmFreetagsMapper(XmFreetagsMapper xmFreetagsMapper) {
		this.xmFreetagsMapper = xmFreetagsMapper;
	}
	
	XmFreetaggedObjectsMapper xmFreetaggedObjectsMapper;
	@Resource(name="xmFreetaggedObjectsMapper")
	public void setXmFreetaggedObjectsMapper(
			XmFreetaggedObjectsMapper xmFreetaggedObjectsMapper) {
		this.xmFreetaggedObjectsMapper = xmFreetaggedObjectsMapper;
	}

	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}


	@Override
	public List<XmFreetags> getModuleTags(String module, int recordid) {
		return this.xmFreetagsMapper.getModuleTags(module,recordid);
	}


	@Override
	public int add(String tag, String module, Integer objectid) {
		
		int id = this.xmSequenceService.getSequenceId("freetags");
		
		XmFreetags freetags = new XmFreetags();
		freetags.setId(id);
		freetags.setRawTag(tag);
		freetags.setTag(tag);
		xmFreetagsMapper.insertSelective(freetags);
		
		//进行关联
		XmFreetaggedObjects taggedobject = new XmFreetaggedObjects();
		taggedobject.setModule(module);
		taggedobject.setObjectId(objectid);
		taggedobject.setTaggedOn(new Date());
		taggedobject.setTaggerId(1);
		taggedobject.setTagId(id);
		this.xmFreetaggedObjectsMapper.insertSelective(taggedobject);
		
		return id;
	}


	@Override
	public boolean deleteById(int id) {
		
		this.xmFreetagsMapper.deleteByPrimaryKey(id);
		int affectrow = this.xmFreetaggedObjectsMapper.deleteByTagid(id);
		
		return affectrow>0?true:false;
	}

}

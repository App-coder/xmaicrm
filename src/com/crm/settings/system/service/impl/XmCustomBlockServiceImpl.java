package com.crm.settings.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.crm.model.XmBlocks;
import com.crm.settings.system.mapper.XmBlocksMapper;
import com.crm.settings.system.service.XmCustomBlockService;
import com.crm.util.JsonUtil;
import com.sun.corba.se.impl.copyobject.JavaStreamObjectCopierImpl;

@Service("XmCustomBlockService")
public class XmCustomBlockServiceImpl implements XmCustomBlockService{
	
	XmBlocksMapper xmBlocksMapper;
	@Resource(name="settings.system.mapper.xmBlocksMapper")
	public void setXmBlocksMapper(XmBlocksMapper xmBlocksMapper) {
		this.xmBlocksMapper = xmBlocksMapper;
	}


	@Override
	public List<Object> getBlockList() {
		return this.xmBlocksMapper.getBlockList();
	}
	
	@Override
	public List<XmBlocks> getFieldBlocksByTabId(int tabid,int page,int rows) {
		int offset = (page-1)*rows;
		return this.xmBlocksMapper.getFieldBlocksByTabId(tabid,offset,rows);
	}
	
	@Override
	public int updateByPrimaryKey(String json) {
		XmBlocks xmblock=(XmBlocks)JsonUtil.getObject4JsonString(json, XmBlocks.class);
		int num=this.xmBlocksMapper.updateByPrimaryKey(xmblock); 
		return num;
	}
	
	@Override
	public int deleteByPrimaryKey(String json) {
		int blockid=JSONObject.fromObject(json).getInt("blockid");
		int num=this.xmBlocksMapper.deleteByPrimaryKey(blockid);
		return num;
	}

}

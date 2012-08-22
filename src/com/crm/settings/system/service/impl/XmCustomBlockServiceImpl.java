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

@Service("xmCustomBlockService")
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
	public int updateByPrimaryKey(XmBlocks xmBlocks) {
		int num=this.xmBlocksMapper.updateByPrimaryKey(xmBlocks); 
		return num;
	}
	
	@Override
	public int deleteByPrimaryKey(int blockid) {
		int num=this.xmBlocksMapper.deleteByPrimaryKey(blockid);
		return num;
	}
	
	@Override
	public int getMaxId() {
		return this.xmBlocksMapper.getMaxId();
	}
	
	@Override
	public int insert(XmBlocks xmBlocks) {
		int maxId=this.xmBlocksMapper.getMaxId();
		xmBlocks.setBlockid(++maxId);
		int affectrow=this.xmBlocksMapper.insert(xmBlocks);
		return affectrow;
	}

}

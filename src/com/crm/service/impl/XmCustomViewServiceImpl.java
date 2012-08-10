package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCustomviewMapper;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;

@Service("xmCustomViewService")
public class XmCustomViewServiceImpl implements XmCustomViewService {
	
    XmCustomviewMapper xmCustomviewMapper;
    @Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
	}

	public List<XmCustomview> queryByEntityType(String entitytype) {
		return this.xmCustomviewMapper.queryByEntityType(entitytype);
	}

	@Override
	public int getDefault(String string) {
		return this.xmCustomviewMapper.getDefault(string);
	}

	@Override
	public XmCustomview selectByPrimaryKey(String entitytype, int viewid) {
		if(viewid==-1){
			return this.xmCustomviewMapper.getDefaultCView(entitytype);
		}
		return this.xmCustomviewMapper.selectByPrimaryKey(viewid);
	}

	@Override
	public List<XmCustomview> loadCViewByEntitytype(String entitytype) {
		return this.xmCustomviewMapper.loadCViewByEntitytype(entitytype);
	}

	@Override
	public List<XmCustomview> loadList(String entitytype) {
		return this.xmCustomviewMapper.loadList(entitytype);
	}

	@Override
	public boolean setDef(int cvid, String entitytype) {
		this.xmCustomviewMapper.setAllNotDef(entitytype);
		int result = this.xmCustomviewMapper.setDef(cvid);
		if(result==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCv(int cvid) {
		int result = this.xmCustomviewMapper.deleteByPrimaryKey(cvid);
		if(result==1){
			return true;
		}
		return false;
	}

	@Override
	public Integer insert(XmCustomview cv) {
		return this.xmCustomviewMapper.insert(cv);
	}

	@Override
	public void update(XmCustomview cv) {
		this.xmCustomviewMapper.updateByPrimaryKey(cv);
	}
}

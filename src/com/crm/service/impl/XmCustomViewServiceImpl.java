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
		return this.queryByEntityType(entitytype);
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
}

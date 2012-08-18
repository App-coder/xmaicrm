package com.crm.settings.other.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmCangkus;
import com.crm.settings.other.mapper.XmCangkusMapper;
import com.crm.settings.other.service.XmCangkusService;
@Service("xmCangkusService")
public class XmCangkusServiceImpl implements XmCangkusService {
	
	XmCangkusMapper xmCangkusMapper;
	@Resource(name="xmCangkusMapper")
	public void setXmCangkusMapper(XmCangkusMapper xmCangkusMapper) {
		this.xmCangkusMapper = xmCangkusMapper;
	}


	@Override
	public List<Object> getList() {
		return this.xmCangkusMapper.getList();
	}


	@Override
	public void setStatus(int cangkusid,int isused) {
		//设置为禁用
		XmCangkus cangkus = new XmCangkus();
		cangkus.setCangkusid(cangkusid);
		cangkus.setIsused(isused);
		this.xmCangkusMapper.updateByPrimaryKey(cangkus);
	}

}

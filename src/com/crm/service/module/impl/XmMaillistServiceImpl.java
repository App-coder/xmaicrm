package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmMaillistMapper;
import com.crm.model.XmMaillist;
import com.crm.service.module.XmMaillistService;
@Service("xmMaillistService")
public class XmMaillistServiceImpl implements XmMaillistService {
	
	XmMaillistMapper xmMaillistMapper;
	@Resource(name="xmMaillistMapper")
	public void setXmMaillistMapper(XmMaillistMapper xmMaillistMapper) {
		this.xmMaillistMapper = xmMaillistMapper;
	}

	@Override
	public int getTotal() {
		return this.xmMaillistMapper.getTotal();
	}

	@Override
	public List<XmMaillist> getList(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmMaillistMapper.getList(start,rows);
	}

}

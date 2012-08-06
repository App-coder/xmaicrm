package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmSerialnumbersMapper;
import com.crm.service.module.XmSerialnumbersService;

@Service("xmSerialnumbersService")
public class XmSerialnumbersServiceImpl implements XmSerialnumbersService {

	XmSerialnumbersMapper xmSerialnumbersMapper;
	@Resource(name="xmSerialnumbersMapper")
	public void setXmSerialnumbersMapper(XmSerialnumbersMapper xmSerialnumbersMapper) {
		this.xmSerialnumbersMapper = xmSerialnumbersMapper;
	}

	@Override
	public int getTotal() {
		return this.xmSerialnumbersMapper.getTotal();
	}

	@Override
	public List<Object> loadList(int page, int rows,String order) {
		int start = (page-1)*rows;
		return this.xmSerialnumbersMapper.loadList(start,rows,order);
	}

}

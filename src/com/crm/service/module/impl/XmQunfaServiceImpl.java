package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmQunfaMapper;
import com.crm.model.XmQunfa;
import com.crm.service.module.XmQunfaService;
@Service("xmQunfaService")
public class XmQunfaServiceImpl implements XmQunfaService {

	XmQunfaMapper xmQunfaMapper;
	@Resource(name="xmQunfaMapper")
	public void setXmQunfaMapper(XmQunfaMapper xmQunfaMapper) {
		this.xmQunfaMapper = xmQunfaMapper;
	}

	@Override
	public int getTotal() {
		return this.xmQunfaMapper.getTotal();
	}

	@Override
	public List<XmQunfa> getList(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmQunfaMapper.getList(start,rows);
	}

}

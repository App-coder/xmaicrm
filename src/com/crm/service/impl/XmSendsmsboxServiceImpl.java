package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmSendsmsboxMapper;
import com.crm.model.XmSendsmsbox;
import com.crm.service.XmSendsmsboxService;

@Service("xmSendsmsboxService")
public class XmSendsmsboxServiceImpl implements XmSendsmsboxService {
	
	XmSendsmsboxMapper xmSendsmsboxMapper;
	@Resource(name="xmSendsmsboxMapper")
	public void setXmSendsmsboxMapper(XmSendsmsboxMapper xmSendsmsboxMapper) {
		this.xmSendsmsboxMapper = xmSendsmsboxMapper;
	}


	@Override
	public List<XmSendsmsbox> loadList(int page, int rows, int userid) {
		int start = (page-1)*rows;
		return this.xmSendsmsboxMapper.loadList(start,rows,userid);
	}


	@Override
	public int getTotal(Integer id) {
		return this.xmSendsmsboxMapper.getTotal(id);
	}


	
	
	
}

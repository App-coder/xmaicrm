package com.crm.settings.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmLoginhistory;
import com.crm.settings.basic.mapper.XmLoginhistoryMapper;
import com.crm.settings.basic.service.XmLoginhistoryService;
@Service("xmLoginhistoryService")
public class XmLoginhistoryServiceImpl implements XmLoginhistoryService {
	
	XmLoginhistoryMapper xmLoginhistoryMapper;
	@Resource(name="xmLoginhistoryMapper")
	public void setXmLoginhistoryMapper(XmLoginhistoryMapper xmLoginhistoryMapper) {
		this.xmLoginhistoryMapper = xmLoginhistoryMapper;
	}

	@Override
	public List<XmLoginhistory> getHistoryByName(int page, int rows,
			String username) {
		int start = (page-1)*rows;
		return this.xmLoginhistoryMapper.getHistoryByName(start,rows,username);
	}

	@Override
	public int getTotalByName(String username) {
		return this.xmLoginhistoryMapper.getTotalByName(username);
	}

	
	
}

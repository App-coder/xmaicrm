package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmCvcolumnlistMapper;
import com.crm.model.XmCvcolumnlist;
import com.crm.service.XmCvcolumnlistService;
@Service("xmCvcolumnlistService")
public class XmCvcolumnlistServiceImpl implements XmCvcolumnlistService {
	
	XmCvcolumnlistMapper xmCvcolumnlistMapper;
	@Resource(name="xmCvcolumnlistMapper")
	public void setXmCvcolumnlistMapper(XmCvcolumnlistMapper xmCvcolumnlistMapper) {
		this.xmCvcolumnlistMapper = xmCvcolumnlistMapper;
	}


	@Override
	public List<XmCvcolumnlist> getXmCvcolumnlistByCvid(int viewid) {
		return this.xmCvcolumnlistMapper.getXmCvcolumnlistByCvid(viewid);
	}

}

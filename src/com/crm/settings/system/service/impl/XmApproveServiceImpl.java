package com.crm.settings.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.model.XmApprove;
import com.crm.settings.system.mapper.XmApproveMapper;
import com.crm.settings.system.service.XmApproveService;

@Service("xmApproveService")
public class XmApproveServiceImpl implements XmApproveService {
	
	XmApproveMapper xmApproveMapper;
	@Resource(name="xmApproveMapper")
	public void setXmApproveMapper(XmApproveMapper xmApproveMapper) {
		this.xmApproveMapper = xmApproveMapper;
	}


	@Override
	public List<XmApprove> getApproveList(int tabid) {
		return this.xmApproveMapper.getApproveList(tabid);
	}

}

package com.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmSeactivityrelMapper;
import com.crm.model.XmSeactivityrel;
import com.crm.service.XmSeactivityrelService;

@Service("xmSeactivityrelService")
public class XmSeactivityrelServiceImpl implements XmSeactivityrelService {

	XmSeactivityrelMapper xmSeactivityrelMapper;
	@Resource(name="xmSeactivityrelMapper")
	public void setXmSeactivityrelMapper(XmSeactivityrelMapper xmSeactivityrelMapper) {
		this.xmSeactivityrelMapper = xmSeactivityrelMapper;
	}
	
	@Override
	public XmSeactivityrel getRelAccount(int recordid) {
		return this.xmSeactivityrelMapper.getRelAccount(recordid);
	}

	@Override
	public void insert(int crmid, String relAccount) {
		XmSeactivityrel rel = new XmSeactivityrel();
		rel.setCrmid(Integer.parseInt(relAccount));
		rel.setActivityid(crmid);
		this.xmSeactivityrelMapper.insert(rel);
	}

	@Override
	public void deleteRel(int activityid) {
		this.xmSeactivityrelMapper.deleteByActivityid(activityid);
		
	}
	
	
	
	
}

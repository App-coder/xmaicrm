package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmPotentialMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmPotential;
import com.crm.service.module.XmPotentialService;
import com.crm.util.ArrayUtil;

@Service("xmPotentialService")
public class XmPotentialServiceImpl implements XmPotentialService {
	
	XmPotentialMapper xmPotentialMapper;
	@Resource(name="xmPotentialMapper")
	public void setXmPotentialMapper(XmPotentialMapper xmPotentialMapper) {
		this.xmPotentialMapper = xmPotentialMapper;
	}

	@Override
	public List<XmPotential> getTopPotential() {
		return this.xmPotentialMapper.getTopPotential();
	}

	@Override
	public String getSalesCountByPick(String colvalue, List<Object> ids,String firstday,String lastday) {
		String range = ArrayUtil.arrayToJoinStr(ids, ",", true);
		return this.xmPotentialMapper.getSalesCountByPick(colvalue,range,firstday,lastday);
	}

	@Override
	public int getPotentialOfUserAndLast(Integer id, String start, String end) {
		return this.xmPotentialMapper.getPotentialOfUserAndLast(id,start,end);
	}

	@Override
	public int getTotalForOpportunities(int crmid) {
		return this.xmPotentialMapper.getTotalForOpportunities(crmid);
	}

	@Override
	public List<XmPotential> getOpportunities(int page, int rows, int crmid) {
		int start = (page-1)*rows;
		return this.xmPotentialMapper.getOpportunities(start,rows,crmid);
	}



}

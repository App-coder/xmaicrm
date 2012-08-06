package com.crm.service.module.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmAccountMapper;
import com.crm.model.XmAccount;
import com.crm.service.module.XmAccountService;

@Service("xmAccountService")
public class XmAccountServiceImpl implements XmAccountService {
	
	XmAccountMapper xmAccountMapper;
	@Resource(name="xmAccountMapper")
	public void setXmAccountMapper(XmAccountMapper xmAccountMapper) {
		this.xmAccountMapper = xmAccountMapper;
	}
	@Override
	public String getNewAccounts(String year) {
		return this.xmAccountMapper.getNewAccounts(year);
	}
	@Override
	public List<XmAccount> getTopAccount(String smownerid) {
		return this.xmAccountMapper.getTopAccount(smownerid);
	}
	@Override
	public int getNewAccountOfUserAndLast(Integer userid, String start,
			String end) {
		return this.xmAccountMapper.getNewAccountOfUserAndLast(userid,start,end);
	}
	@Override
	public List<Object> loadUnabsorbed(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmAccountMapper.loadUnabsorbed(start,rows);
	}
	@Override
	public int getTotalUnabsorbed() {
		return this.xmAccountMapper.getTotalUnabsorbed();
	}
    

}

package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmInviteesMapper;
import com.crm.model.XmInvitees;
import com.crm.service.XmInviteesService;

@Service("xmInviteesService")
public class XmInviteesServiceImpl implements XmInviteesService {

	XmInviteesMapper xmInviteesMapper;
	@Resource(name="xmInviteesMapper")
	public void setXmInviteesMapper(XmInviteesMapper xmInviteesMapper) {
		this.xmInviteesMapper = xmInviteesMapper;
	}
	
	@Override
	public List<XmInvitees> getInvitees(int recordid) {
		return this.xmInviteesMapper.getInvitees(recordid);
	}

	@Override
	public void insertList(int crmid, String rel_invitees) {
		String[] invitees = rel_invitees.split(",");
		for(int i=0;i<invitees.length;i++){
			XmInvitees invite = new XmInvitees();
			invite.setActivityid(crmid);
			invite.setInviteeid(Integer.parseInt(invitees[i]));
			this.xmInviteesMapper.insert(invite);
		}
	}

	@Override
	public void clearInvitees(int crmid) {
		this.xmInviteesMapper.clearInvitees(crmid);
		
	}
	
	
}

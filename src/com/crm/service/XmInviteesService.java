package com.crm.service;

import java.util.List;

import com.crm.model.XmInvitees;

public interface XmInviteesService {

	/**
	 * 
	 * 相关信息，邀请同事
	 * 
	 * @param recordid
	 * @return
	 */
	List<XmInvitees> getInvitees(int recordid);

	/**
	 * 
	 * 插入关联同事
	 * 
	 * @param crmid
	 * @param rel_invitees
	 */
	void insertList(int crmid, String rel_invitees);

	/**
	 * 清空邀请列表
	 * 
	 * @param crmid
	 */
	void clearInvitees(int crmid);

}

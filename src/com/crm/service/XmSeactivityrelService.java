package com.crm.service;

import com.crm.model.XmSeactivityrel;

public interface XmSeactivityrelService {

	/**
	 * 
	 * 根据日程，获取相关信息-用户
	 * 
	 * @param recordid 记录ID 
	 * @return
	 */
	XmSeactivityrel getRelAccount(int recordid);

	void insert(int crmid, String relAccount);

	/**
	 * 
	 * 删除用户关联
	 * @param crmid
	 */
	void deleteRel(int crmid);

}

package com.crm.service.module;

import java.util.List;

import com.crm.model.XmAccount;


public interface XmAccountService  {

	String getNewAccounts(String year);

	List<XmAccount> getTopAccount(String smownerid);

	/**
	 * 取得最近新增的客户，根据user
	 * 
	 * @param integer
	 * @param start
	 * @param end
	 * @return
	 */
	int getNewAccountOfUserAndLast(Integer userid, String start, String end);
 
}

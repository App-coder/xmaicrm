package com.crm.service.portlets;

import java.util.List;

import com.crm.model.XmAccount;

public interface XmAccountService {

	List<XmAccount> getTodayaccount(String smownerid,String contactdate);

}

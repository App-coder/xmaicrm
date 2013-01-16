package com.crm.service;

import java.util.List;

import com.crm.model.XmContactdetails;

public interface XmContactdetailsService {

	int getTotalForGetContacts(int campaignid);

	List<XmContactdetails> getContactdetails(int page, int rows, int campaignid);

	List<XmContactdetails> getContactdetailsByAccountid(String accountid);

}

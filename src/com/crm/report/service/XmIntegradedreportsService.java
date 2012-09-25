package com.crm.report.service;

import java.util.List;

import com.crm.model.XmCangkuInfo;
import com.crm.model.XmStaffMonthly;
import com.crm.model.XmUsersalesinforeport;

public interface XmIntegradedreportsService {
	
    List<XmStaffMonthly> staffMonthly();
     
    List<XmCangkuInfo> queryCangkuTotal();
    
    List<XmCangkuInfo> getCangkuFooter();
    
    List<XmUsersalesinforeport> queryUsersalesinforeport(int page, int rows,int id,String duedate);
    
    int getTotal(int id,String duedate);

}

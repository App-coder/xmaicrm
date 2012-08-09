package com.crm.report.service;

import java.util.List;

import com.crm.model.XmCangkuInfo;
import com.crm.model.XmIntegradedModel;
import com.crm.model.XmStaffMonthly;
import com.crm.model.XmUsersalesinforeport;

public interface XmIntegradedreportsService {
	
    List<XmStaffMonthly> staffMonthly();
     
    List<XmCangkuInfo> queryCangkuTotal();
    
    List<XmCangkuInfo> getCangkuFooter();
    
    List<Object> getReportFooter(int id,String duedate);
    
    List<Object> queryIntegradedreport(int id,String duedate);
    
    List<Object> getMerge(int id,String duedate);
    int getTotal(int id,String duedate);

}

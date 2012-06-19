package com.crm.service.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprove;
import com.crm.model.XmApprovestep;

public interface XmApproveService {

	List<XmApprove> getApproveList(int tabid);
	
	XmApprove getApproveListById(int approveid);
	
	List<Object> getApproveStepList(int approveid);
	
	List<Object> getApproveRole(int approveid);
	
	int updateMultiApprove(XmApprove xmApprove,int approveid,String userArr);
	
	int getApproveUsed(int approveid);
	
	XmApprovestep getApproveStepById(Integer id);
	
	List<Object> getApproveStepUsers();

}

package com.crm.service.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprove;
import com.crm.model.XmApprovestep;
import com.crm.model.XmStepadvfilters;

public interface XmApproveService {

	List<XmApprove> getApproveList(int tabid);
	
	XmApprove getApproveListById(int approveid);
	
	List<Object> getApproveStepList(int approveid);
	
	List<Object> getApproveRole(int approveid);
	
	int updateMultiApprove(XmApprove xmApprove,int approveid,String userArr);
	
	int getApproveUsed(int approveid);
	
	XmApprovestep getApproveStepById(Integer id);
	
	List<Object> getApproveStepUsers();
	
	List<XmApprovestep> getApproveNextStep(int approveid,int id);
	
	List<XmStepadvfilters> getStepAdvFilterById(int stepid);
	
	int updateApproveStepById(int stepid,String step,String step2users,String step2fields,String step2advoption);

}

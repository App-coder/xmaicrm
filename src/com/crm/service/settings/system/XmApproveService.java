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
	
	int insertMultiApprove(XmApprove xmApprove,int approveid,String userArr);
	
	int deleteMultiApprove(int id);
	
	int getApproveUsed(int approveid);
	
	XmApprovestep getApproveStepById(Integer id);
	
	List<Object> getApproveStepUsers();
	
	List<XmApprovestep> getApproveNextStep(int approveid,int id);
	
	List<XmStepadvfilters> getStepAdvFilterById(int stepid);
	
	int updateApproveStepById(int stepid,String step,String step2users,String step2fields,String step2advoption);

	int insertApproveStep(int stepid,String step,String step2users,String step2fields,String step2advoption);
    
	int deleteApproveStep(int id);
	
	int gotoUpDownStep(int stepid,int approveid,int sequnce,String operation);
	
	boolean islaststep(int sequnce,int approveid);
	
	String getApproveRelatedModule(int approveid);
	
	int forceApproveFinish(int approveid,String modulename,int userid);
	int forceApproveRetStart(int approveid,String modulename,int userid);
	
	List<Object> approveStatus(String where,int userid,int page,int rows);
	
	int approveStatusTotal(String where,int userid);
	
	String getEntityCrmId(int crmid,String setype);
	
}

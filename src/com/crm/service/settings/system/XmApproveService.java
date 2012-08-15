package com.crm.service.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprove;

public interface XmApproveService {

	List<XmApprove> getApproveList(int tabid);
	
	List<Object> getApproveRole(int approveid);
	
	int updateMultiApprove(XmApprove xmApprove,int approveid,String userArr);
	
	int getApproveUsed(int approveid);

}

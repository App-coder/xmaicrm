package com.crm.mapper.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprove;

public interface XmApproveMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(XmApprove record);

    int insertSelective(XmApprove record);

    XmApprove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmApprove record);

    int updateByPrimaryKeyWithBLOBs(XmApprove record);

    int updateByPrimaryKey(XmApprove record);

	List<XmApprove> getApproveList(@Param("tabid") int tabid);
	
	XmApprove getApproveListById(@Param("approveid") int approveid);
	
	List<Object> getApproveStepList(@Param("approveid") int approveid);
	
	List<Object> getApproveRole(@Param("approveid") int approveid);
	
	String getApproveRelatedModule(@Param("approveid") int approveid);
}
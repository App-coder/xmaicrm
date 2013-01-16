package com.crm.mapper.settings.system;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprovestep;

public interface XmApprovestepMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(XmApprovestep record);

    int insertSelective(XmApprovestep record);

    XmApprovestep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmApprovestep record);

    int updateByPrimaryKeyWithBLOBs(XmApprovestep record);

    int updateByPrimaryKey(XmApprovestep record);
    
    int upPreStepSequnce(@Param("approveid") int approveid,@Param("sequnce") int sequnce);
    int upStepSequnce(@Param("stepid") int stepid);
    int downPreStepSequnce(@Param("approveid") int approveid,@Param("sequnce") int sequnce);
    int downStepSequnce(@Param("stepid") int stepid);
    
    XmApprovestep getApproveStepById(@Param("id") int id);
    
    List<Object> getApproveStepUsers();
    
    List<XmApprovestep> getApproveNextStep(@Param("approveid") int approveid,@Param("id") int id);
    
    int getApproveStepSequnce(@Param("approveid") int approveid);
}
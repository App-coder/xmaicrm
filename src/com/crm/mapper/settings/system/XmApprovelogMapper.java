package com.crm.mapper.settings.system;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprovelog;

public interface XmApprovelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmApprovelog record);

    int insertSelective(XmApprovelog record);

    XmApprovelog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmApprovelog record);

    int updateByPrimaryKeyWithBLOBs(XmApprovelog record);

    int updateByPrimaryKey(XmApprovelog record);
    
    int getApproveUsed(@Param("tablename") String tablename,@Param("fieldid") String fieldid,@Param("approveid") int approveid);
}
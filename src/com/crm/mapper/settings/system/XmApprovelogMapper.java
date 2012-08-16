package com.crm.mapper.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmApprovelog;

public interface XmApprovelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmApprovelog record);

    int insertSelective(XmApprovelog record);

    XmApprovelog selectByPrimaryKey(Integer id);
    
    List<XmApprovelog> selectByApproveid(@Param("approveid") int approveid);

    int updateByPrimaryKeySelective(XmApprovelog record);

    int updateByPrimaryKeyWithBLOBs(XmApprovelog record);

    int updateByPrimaryKey(XmApprovelog record);
    
    int updateApproveRefuse(@Param("userid") int userid,@Param("nowtime") String nowtime,@Param("logid") int logid);
    
    int updateModuleRelRefuse(@Param("tablename") String tablename,@Param("fieldid") String fieldid,@Param("crmid") int crmid);
    
    int getApproveUsed(@Param("tablename") String tablename,@Param("fieldid") String fieldid,@Param("approveid") int approveid);
    
    int updateByApproveid(@Param("userid") int userid,@Param("approveid") int  approveid);
    
    int updateModuleRel(@Param("tablename") String tablename,@Param("userid") int userid,@Param("fieldid") String  fieldid,@Param("approveid") int  approveid);

    List<Object> getApproveStatus(@Param("subquery") String subquery,@Param("userid") int userid,@Param("where") String where,@Param("start") int start,@Param("rows") int rows);

    int getApproveStatusTotal(@Param("subquery") String subquery,@Param("userid") int userid,@Param("where") String where);

}
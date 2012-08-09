package com.crm.report.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmCangkuInfo;
import com.crm.model.XmGathers;
import com.crm.model.XmSalesTotal;

public interface XmIntegradedreportsMapper extends ModuleMapper<XmGathers> {
    int deleteByPrimaryKey(Integer gathersid);

    int insert(XmGathers record);

    int insertSelective(XmGathers record);

    XmGathers selectByPrimaryKey(Integer gathersid);

    int updateByPrimaryKeySelective(XmGathers record);

    int updateByPrimaryKeyWithBLOBs(XmGathers record);

    int updateByPrimaryKey(XmGathers record);
    
    
    //销售汇总表
    List<XmSalesTotal> querySalesTotal();
    
   // 库存资产
    List<XmCangkuInfo> queryCangkuTotal();
    List<XmCangkuInfo> getCangkuFooter();
    
    List<Object> getReportFooter(@Param("id") int id,@Param("duedate") String duedate);
    
    
    List<Object>queryIntegradedreport(@Param("id") int id,@Param("duedate") String duedate);
    
    List<Object> getMerge(@Param("id") int id,@Param("duedate") String duedate);
    int getTotal(@Param("id") int id,@Param("duedate") String duedate);
}
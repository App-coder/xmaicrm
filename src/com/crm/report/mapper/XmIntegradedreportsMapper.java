package com.crm.report.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmCangkuInfo;
import com.crm.model.XmGathers;
import com.crm.model.XmSalesTotal;
import com.crm.model.XmUsersalesinforeport;

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
    
    //人员签署合同明细表
    List<XmUsersalesinforeport>queryUsersalesinforeport(@Param("start") int start,@Param("rows") int rows,@Param("id") int id,@Param("duedate") String duedate);
    
    int getTotal(@Param("id") int id,@Param("duedate") String duedate);
}
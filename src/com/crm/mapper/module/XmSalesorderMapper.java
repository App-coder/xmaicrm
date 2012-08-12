package com.crm.mapper.module;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmSalesorder;

public interface XmSalesorderMapper extends ModuleMapper<XmSalesorder> {
    int deleteByPrimaryKey(Integer salesorderid);

    int insert(XmSalesorder record);

    int insertSelective(XmSalesorder record);

    XmSalesorder selectByPrimaryKey(Integer salesorderid);

    int updateByPrimaryKeySelective(XmSalesorder record);

    int updateByPrimaryKeyWithBLOBs(XmSalesorder record);

    int updateByPrimaryKey(XmSalesorder record);

	String getSum(@Param("year") String year,@Param("month") String month);

	String getFinished(@Param("firstDayOfMonth") String firstDayOfMonth,@Param("lastDayOfMonth") String lastDayOfMonth);
}

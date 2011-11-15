package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.bean.amcharts.portlets.Salesbymonth;
import com.crm.bean.amcharts.portlets.Salesyear;
import com.crm.bean.portlets.salesyearinfo.SalesorderStat;
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

	List<Salesbymonth> getTopSalesByMonth(@Param("prev") String prev,@Param("today") String today);

	List<Salesyear> getSalesOfYear(@Param("year") String year);

	SalesorderStat getSalesorderStat(@Param("year") String year);
}

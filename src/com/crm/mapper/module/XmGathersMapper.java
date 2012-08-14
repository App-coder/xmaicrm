package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.bean.amcharts.portlets.salesyearinfo.GatherStat;
import com.crm.bean.crm.portlets.GatherYear;
import com.crm.model.XmGathers;

public interface XmGathersMapper {
    int deleteByPrimaryKey(Integer gathersid);

    int insert(XmGathers record);

    int insertSelective(XmGathers record);

    XmGathers selectByPrimaryKey(Integer gathersid);

    int updateByPrimaryKeySelective(XmGathers record);

    int updateByPrimaryKeyWithBLOBs(XmGathers record);

    int updateByPrimaryKey(XmGathers record);

	List<XmGathers> getGathersAll();

	List<XmGathers> getCustomerCharge();

	List<XmGathers> getSupplierCharge();

	List<GatherYear> getYearGather(@Param("fistday") String fistday,@Param("lastday") String lastday);

	String getSum(@Param("year") String year,@Param("month") String month);

	String getFinished(@Param("firstDayOfMonth") String firstDayOfMonth,@Param("lastDayOfMonth") String lastDayOfMonth);

	GatherStat getGatherStat(@Param("year") String year);

}
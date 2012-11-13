package com.crm.mapper.module;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

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

	List<Map> getYearGather(@Param("fistday") String fistday,@Param("lastday") String lastday);

	List<Map> getLastYearGather(@Param("fistday") String fistday,@Param("lastday") String lastday);
}
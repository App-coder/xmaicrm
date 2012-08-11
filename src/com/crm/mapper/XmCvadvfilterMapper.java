package com.crm.mapper;

import java.util.List;

import com.crm.model.XmCvadvfilter;
import org.apache.ibatis.annotations.Param;

public interface XmCvadvfilterMapper {
    int deleteByPrimaryKey(@Param("columnindex") Integer columnindex, @Param("cvid") Integer cvid);

    int insert(XmCvadvfilter record);

    int insertSelective(XmCvadvfilter record);

    XmCvadvfilter selectByPrimaryKey(@Param("columnindex") Integer columnindex, @Param("cvid") Integer cvid);

    int updateByPrimaryKeySelective(XmCvadvfilter record);

    int updateByPrimaryKey(XmCvadvfilter record);

	List<XmCvadvfilter> getAdvFilters(@Param("viewid") int viewid);
}
package com.crm.mapper.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmMultifield;

public interface XmMultifieldMapper {
    int insert(XmMultifield record);

    int insertSelective(XmMultifield record);

	List<XmMultifield> getMultifield(@Param("tabid") int tabid);
}
package com.crm.settings.basic.mapper;

import java.util.List;

import com.crm.model.XmCustomsharings;
import org.apache.ibatis.annotations.Param;

public interface XmCustomsharingsMapper {
    int deleteByPrimaryKey(@Param("shared") Integer shared, @Param("sharingstype") Integer sharingstype, @Param("tabid") Integer tabid, @Param("whoshared") Integer whoshared);

    int insert(XmCustomsharings record);

    int insertSelective(XmCustomsharings record);

    XmCustomsharings selectByPrimaryKey(@Param("shared") Integer shared, @Param("sharingstype") Integer sharingstype, @Param("tabid") Integer tabid, @Param("whoshared") Integer whoshared);

    int updateByPrimaryKeySelective(XmCustomsharings record);

    int updateByPrimaryKey(XmCustomsharings record);

	List<XmCustomsharings> getShares(@Param("tabid") int tabid);
}
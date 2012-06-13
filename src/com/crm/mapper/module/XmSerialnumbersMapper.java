package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmSerialnumbers;

public interface XmSerialnumbersMapper {
    int deleteByPrimaryKey(Integer serialid);

    int insert(XmSerialnumbers record);

    int insertSelective(XmSerialnumbers record);

    XmSerialnumbers selectByPrimaryKey(Integer serialid);

    int updateByPrimaryKeySelective(XmSerialnumbers record);

    int updateByPrimaryKey(XmSerialnumbers record);

	int getTotal();

	List<Object> loadList(@Param("start") int start,@Param("rows") int rows,@Param("order") String order);
}
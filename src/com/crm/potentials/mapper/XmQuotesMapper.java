package com.crm.potentials.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmQuotes;

public interface XmQuotesMapper {
	
    int deleteByPrimaryKey(Integer quoteid);

    int insert(XmQuotes record);

    int insertSelective(XmQuotes record);

    XmQuotes selectByPrimaryKey(Integer quoteid);

    int updateByPrimaryKeySelective(XmQuotes record);

    int updateByPrimaryKeyWithBLOBs(XmQuotes record);

    int updateByPrimaryKey(XmQuotes record);

	int getTotal(@Param("filter") String filter);

	List<XmQuotes> loadList(@Param("start") int start,@Param("rows") int rows,@Param("filter") String filter);

}

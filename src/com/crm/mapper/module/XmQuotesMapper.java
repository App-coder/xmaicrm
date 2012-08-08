package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmQuotes;
import com.crm.model.XmTuihuos;

public interface XmQuotesMapper extends ModuleMapper<XmQuotes>{
	
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

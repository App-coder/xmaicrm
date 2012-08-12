package com.crm.settings.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmLoginhistory;

public interface XmLoginhistoryMapper {

    int deleteByPrimaryKey(Integer loginId);

    int insert(XmLoginhistory record);

    int insertSelective(XmLoginhistory record);

    XmLoginhistory selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(XmLoginhistory record);

    int updateByPrimaryKey(XmLoginhistory record);
	
	List<XmLoginhistory> getHistoryByName(@Param("start") int start,@Param("rows") int rows,@Param("username") String username);

	int getTotalByName(@Param("username") String username);

}

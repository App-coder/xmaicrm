package com.crm.mapper.settings.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmRelatedlists;

public interface XmRelatedlistsMapper {
    int deleteByPrimaryKey(Integer relationId);

    int insert(XmRelatedlists record);

    int insertSelective(XmRelatedlists record);

    XmRelatedlists selectByPrimaryKey(Integer relationId);

    int updateByPrimaryKeySelective(XmRelatedlists record);

    int updateByPrimaryKey(XmRelatedlists record);

	List<XmRelatedlists> getRelatedByTabid(@Param("tabid") int tabid);

	List<XmRelatedlists> getRelatedlistByTabid(@Param("tabid") Integer tabid);

}
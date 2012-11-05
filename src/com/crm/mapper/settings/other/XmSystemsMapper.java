package com.crm.mapper.settings.other;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmSystems;

public interface XmSystemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmSystems record);

    int insertSelective(XmSystems record);

    XmSystems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmSystems record);

    int updateByPrimaryKey(XmSystems record);

	List<XmSystems> getSystemsByType(@Param("type") String type);
}

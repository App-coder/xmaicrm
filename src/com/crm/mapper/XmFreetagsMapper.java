package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmFreetags;

public interface XmFreetagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmFreetags record);

    int insertSelective(XmFreetags record);

    XmFreetags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmFreetags record);

    int updateByPrimaryKey(XmFreetags record);

	List<XmFreetags> getModuleTags(@Param("module") String module,@Param("recordid") int recordid);

	List<XmFreetags> getFreetags();
}
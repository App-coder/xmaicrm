package com.crm.mapper;

import com.crm.model.XmFreetaggedObjects;
import org.apache.ibatis.annotations.Param;

public interface XmFreetaggedObjectsMapper {
    int deleteByPrimaryKey(@Param("objectId") Integer objectId, @Param("tagId") Integer tagId, @Param("taggerId") Integer taggerId);

    int insert(XmFreetaggedObjects record);

    int insertSelective(XmFreetaggedObjects record);

    XmFreetaggedObjects selectByPrimaryKey(@Param("objectId") Integer objectId, @Param("tagId") Integer tagId, @Param("taggerId") Integer taggerId);

    int updateByPrimaryKeySelective(XmFreetaggedObjects record);

    int updateByPrimaryKey(XmFreetaggedObjects record);

	int deleteByTagid(@Param("id") int id);
}
package com.crm.mapper.settings.basic;

import com.crm.model.XmProfile2field;
import org.apache.ibatis.annotations.Param;

public interface XmProfile2fieldMapper {
    int deleteByPrimaryKey(@Param("fieldid") Integer fieldid, @Param("profileid") Integer profileid);
    int deleteByFieldId(@Param("fieldid") Integer fieldid);

    void insert(XmProfile2field record);

    int insertSelective(XmProfile2field record);

    XmProfile2field selectByPrimaryKey(@Param("fieldid") Integer fieldid, @Param("profileid") Integer profileid);

    int updateByPrimaryKeySelective(XmProfile2field record);

    int updateByPrimaryKey(XmProfile2field record);
}
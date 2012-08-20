package com.crm.mapper;

import com.crm.model.XmSeattachmentsrel;
import org.apache.ibatis.annotations.Param;

public interface XmSeattachmentsrelMapper {
    int deleteByPrimaryKey(@Param("attachmentsid") Integer attachmentsid, @Param("crmid") Integer crmid);

    int insert(XmSeattachmentsrel record);

    int insertSelective(XmSeattachmentsrel record);
}
package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmAttachments;

public interface XmAttachmentsMapper {
    int deleteByPrimaryKey(Integer attachmentsid);

    int insert(XmAttachments record);

    int insertSelective(XmAttachments record);

    XmAttachments selectByPrimaryKey(Integer attachmentsid);

    int updateByPrimaryKeySelective(XmAttachments record);

    int updateByPrimaryKey(XmAttachments record);

	List<XmAttachments> getRelAttachments(@Param("module") String module,@Param("crmid") Integer crmid,@Param("start") int start,@Param("rows") int rows);

	int getTotalRelAttachments(@Param("module") String module,@Param("crmid") Integer crmid);
}
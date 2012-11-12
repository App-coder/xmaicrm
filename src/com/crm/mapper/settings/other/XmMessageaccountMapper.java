package com.crm.mapper.settings.other;

import com.crm.model.XmMessageaccount;

public interface XmMessageaccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmMessageaccount record);

    int insertSelective(XmMessageaccount record);

    XmMessageaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmMessageaccount record);

    int updateByPrimaryKey(XmMessageaccount record);

	XmMessageaccount getMessageAccount();
}
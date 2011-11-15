package com.crm.mapper.module;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmAccount;

public interface XmAccountMapper extends ModuleMapper<XmAccount> {
    int deleteByPrimaryKey(Integer accountid);

    int insert(XmAccount record);

    int insertSelective(XmAccount record);

    XmAccount selectByPrimaryKey(Integer accountid);

    int updateByPrimaryKeySelective(XmAccount record);

    int updateByPrimaryKeyWithBLOBs(XmAccount record);

    int updateByPrimaryKey(XmAccount record);

	String getNewAccounts(@Param("year") String year);
}
package com.crm.mapper.module;

import java.util.List;

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

	List<XmAccount> getTopAccount(@Param("smownerid") String smownerid);

	int getNewAccountOfUserAndLast(@Param("userid") Integer userid,@Param("start") String start,@Param("end") String end);

	List<Object> loadUnabsorbed(@Param("start") int start,@Param("rows") int rows);

	int getTotalUnabsorbed();

	int getTotalAssigned();

	List<Object> loadAssigned(@Param("start") int start,@Param("rows") int rows);

	List<XmAccount> getAccount(@Param("campaignid") int campaignid,@Param("start") int start,@Param("rows") int rows);

	String getExistAccounts(@Param("campaignid") int campaignid);

	List<XmAccount> getAccountsExist(@Param("campaignid") int campaignid);

	int getTotalAccount(@Param("campaignid") int campaignid);

	List<XmAccount> getTodayaccount(@Param("smownerid") String smownerid,@Param("contactdate") String contactdate);
}
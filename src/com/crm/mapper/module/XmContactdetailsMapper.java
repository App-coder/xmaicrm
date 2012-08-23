package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmContactdetails;

public interface XmContactdetailsMapper extends ModuleMapper<XmContactdetails>{
    int deleteByPrimaryKey(Integer contactid);

    int insert(XmContactdetails record);

    int insertSelective(XmContactdetails record);

    XmContactdetails selectByPrimaryKey(Integer contactid);

    int updateByPrimaryKeySelective(XmContactdetails record);

    int updateByPrimaryKeyWithBLOBs(XmContactdetails record);

    int updateByPrimaryKey(XmContactdetails record);

	int getTotalForGetContacts(@Param("campaignid") int campaignid);

	List<XmContactdetails> getContactdetails(@Param("start") int start,@Param("rows") int rows,@Param("campaignid") int campaignid);
}
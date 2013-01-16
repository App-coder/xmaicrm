package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmMemdays;

public interface XmMemdaysMapper {
    int deleteByPrimaryKey(Integer memdaysid);

    int insert(XmMemdays record);

    int insertSelective(XmMemdays record);

    XmMemdays selectByPrimaryKey(Integer memdaysid);

    int updateByPrimaryKeySelective(XmMemdays record);

    int updateByPrimaryKeyWithBLOBs(XmMemdays record);

    int updateByPrimaryKey(XmMemdays record);

	List<XmMemdays> getAccountMemdays(@Param("fday") String fday,@Param("lday") String lday);
}
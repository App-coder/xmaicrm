package com.crm.settings.other.mapper;

import java.util.List;

import com.crm.model.XmCurrencyInfo;

public interface XmCurrencyInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(XmCurrencyInfo record);

    int insertSelective(XmCurrencyInfo record);

    XmCurrencyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmCurrencyInfo record);

    int updateByPrimaryKey(XmCurrencyInfo record);
	
	List<XmCurrencyInfo> getAll();

}

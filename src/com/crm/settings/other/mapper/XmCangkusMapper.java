package com.crm.settings.other.mapper;

import java.util.List;

import com.crm.model.XmCangkus;

public interface XmCangkusMapper {

    int deleteByPrimaryKey(Integer cangkusid);

    int insert(XmCangkus record);

    int insertSelective(XmCangkus record);

    XmCangkus selectByPrimaryKey(Integer cangkusid);

    int updateByPrimaryKeySelective(XmCangkus record);

    int updateByPrimaryKey(XmCangkus record);
	
	List<Object> getList();

}

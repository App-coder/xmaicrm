package com.crm.mapper.settings.other;

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

	List<Object> getCangkussets();

	List<XmCangkus> getCangkus();

}

package com.crm.mapper.settings.other;

import java.util.List;

import com.crm.model.XmEmailtemplates;

public interface XmEmailtemplatesMapper {

    int deleteByPrimaryKey(Integer templateid);

    int insert(XmEmailtemplates record);

    int insertSelective(XmEmailtemplates record);

    XmEmailtemplates selectByPrimaryKey(Integer templateid);

    int updateByPrimaryKeySelective(XmEmailtemplates record);

    int updateByPrimaryKeyWithBLOBs(XmEmailtemplates record);

    int updateByPrimaryKey(XmEmailtemplates record);
	
	List<XmEmailtemplates> getAll();

}

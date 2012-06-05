package com.crm.mapper.settings.system;

import java.util.List;

import com.crm.model.XmParenttab;

public interface XmParenttabMapper {
    int deleteByPrimaryKey(Integer parenttabid);

    int insert(XmParenttab record);

    int insertSelective(XmParenttab record);

    XmParenttab selectByPrimaryKey(Integer parenttabid);

    int updateByPrimaryKeySelective(XmParenttab record);

    int updateByPrimaryKey(XmParenttab record);

	List<XmParenttab> getAll();

	List<XmParenttab> getVisibleParenttab();
}

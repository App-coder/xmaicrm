package com.crm.settings.system.mapper;

import com.crm.model.XmParenttab;
import com.crm.model.XmParenttabrel;

public interface XmParenttabrelMapper {
    int insert(XmParenttabrel record);
    int insertSelective(XmParenttabrel record);
	void clearRelByParentid(int parenttabid);
}

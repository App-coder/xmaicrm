package com.crm.mapper.settings.system;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmParenttab;
import com.crm.model.XmParenttabrel;

public interface XmParenttabrelMapper {
    int insert(XmParenttabrel record);
    int insertSelective(XmParenttabrel record);
	void clearRelByParentid(int parenttabid);
	int getPtbByTabid(@Param("tabid") Integer tabid);
}

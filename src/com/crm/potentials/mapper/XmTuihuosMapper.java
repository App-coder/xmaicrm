package com.crm.potentials.mapper;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmTuihuos;

public interface XmTuihuosMapper extends ModuleMapper<XmTuihuos>{
    int deleteByPrimaryKey(Integer tuihuosid);

    int insert(XmTuihuos record);

    int insertSelective(XmTuihuos record);

    XmTuihuos selectByPrimaryKey(Integer tuihuosid);

    int updateByPrimaryKeySelective(XmTuihuos record);

    int updateByPrimaryKeyWithBLOBs(XmTuihuos record);

    int updateByPrimaryKey(XmTuihuos record);
}
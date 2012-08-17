package com.crm.customer.mapper;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmNotes;

public interface XmNotesMapper extends ModuleMapper<XmNotes> {
    int deleteByPrimaryKey(Integer notesid);

    int insert(XmNotes record);

    int insertSelective(XmNotes record);

    XmNotes selectByPrimaryKey(Integer notesid);

    int updateByPrimaryKeySelective(XmNotes record);

    int updateByPrimaryKeyWithBLOBs(XmNotes record);

    int updateByPrimaryKey(XmNotes record);
}
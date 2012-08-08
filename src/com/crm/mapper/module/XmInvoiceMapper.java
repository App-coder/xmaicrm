package com.crm.mapper.module;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmInvoice;

public interface XmInvoiceMapper extends ModuleMapper<XmInvoice> {
    int deleteByPrimaryKey(Integer invoiceid);

    int insert(XmInvoice record);

    int insertSelective(XmInvoice record);

    XmInvoice selectByPrimaryKey(Integer invoiceid);

    int updateByPrimaryKeySelective(XmInvoice record);

    int updateByPrimaryKeyWithBLOBs(XmInvoice record);

    int updateByPrimaryKey(XmInvoice record);
}

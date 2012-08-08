package com.crm.product.mapper;

import com.crm.model.XmCatalogSeq;

public interface XmCatalogSeqMapper {
    int insert(XmCatalogSeq record);

    int insertSelective(XmCatalogSeq record);
}
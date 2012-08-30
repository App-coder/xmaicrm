package com.crm.product.service;

import java.util.List;

import com.crm.model.XmCatalog;

public interface XmCatalogService {

	List<XmCatalog> getCatalogById(String parentid);

}

package com.crm.service.module;

import java.util.List;

import com.crm.model.XmCatalog;

public interface XmCatalogService {

	List<XmCatalog> getCatalogById(String parentid);

}

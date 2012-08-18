package com.crm.settings.other.service;

import java.util.List;

import com.crm.model.XmCurrencyInfo;

public interface XmCurrencyInfoService {

	List<XmCurrencyInfo> getAll();

	void update(XmCurrencyInfo currency);

	void insert(XmCurrencyInfo currency);

	Object getCurrencyById(int cid);

	void deleteById(int cid);

}

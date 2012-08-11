package com.crm.service;

import java.util.List;

import com.crm.model.XmPotential;

public interface ModuleService<T> {
	int getTotal(int viewid);
	List<T> loadList(int page, int rows, int viewid);
}

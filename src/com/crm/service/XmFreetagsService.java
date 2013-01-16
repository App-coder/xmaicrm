package com.crm.service;

import java.util.List;

import com.crm.model.XmFreetags;

public interface XmFreetagsService {

	List<XmFreetags> getModuleTags(String module, int recordid);

	int add(String tag, String module, Integer objectid);

	boolean deleteById(int id);

}

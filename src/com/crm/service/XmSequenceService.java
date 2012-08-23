package com.crm.service;

public interface XmSequenceService {
	public int getSequenceId(String table);
	public int getMaxAddOne(String table,String key);
}

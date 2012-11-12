package com.crm.mapper.module;

import java.util.List;

import com.crm.model.XmComplaints;

public interface XmComplaintsMapper {

	int getTotal(String filter);

	List<XmComplaints> loadList(int start, int rows, String filter);

}

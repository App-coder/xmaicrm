package com.crm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCvadvfilter;

public interface XmCvadvfilterService {

	void deleteCv(int cvid);

	void insert(XmCvadvfilter advfilter);

	XmCvadvfilter getAdvfilter(int viewid);

	List<XmCvadvfilter> getAdvFilters(int viewid);

}

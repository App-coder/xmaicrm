package com.crm.service;


import com.crm.model.XmCvstdfilter;

public interface XmCvstdfilterService {

	void deleteCv(int cvid);

	void insert(XmCvstdfilter stdfilter);

	XmCvstdfilter getStdfilterByCvid(int viewid);


}

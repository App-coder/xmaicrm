package com.crm.service;

import java.util.List;

import com.crm.model.XmEntityname;

public interface XmEntitynameService {

	List<XmEntityname> getEntityname();

	XmEntityname getEntityByModule(String module);


}

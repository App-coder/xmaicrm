package com.crm.service.settings.system;

import java.util.List;

import com.crm.model.XmRelatedlists;

public interface XmRelatedlistsService {

	List<XmRelatedlists> getRelatedByTabid(int tabid);

}
